package org.mackenzie;

import java.math.RoundingMode;
import java.util.*;
import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import java.util.AbstractMap.SimpleEntry;
import java.util.Spliterator;
import java.util.Spliterators;

import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.groupingBy;

class SamplePreprocessor {

    private final SampleNormalizer normalizer;

    SamplePreprocessor(SampleNormalizer normalizer) {
        this.normalizer = normalizer;
    }

    Stream<BigDecimal> preprocess(Stream<BigDecimal> input) {
        if (input == null) {
            return Stream.empty();
        }

        // First filter out nulls and negatives, then process in triples
        List<BigDecimal> result = input
            .filter(Objects::nonNull)
            .filter(value -> value.compareTo(BigDecimal.ZERO) >= 0)
            // Collect to list to work with indices
            .collect(groupingBy(
                // Group by the index of the element divided by 3
                // This creates groups of 3 consecutive elements
                index -> index.divide(BigDecimal.valueOf(3), RoundingMode.DOWN),
                // Collect each group into a list
                Collectors.mapping(
                    value -> value,
                    Collectors.toList()
                )
            ))
            .values()
            .stream()
            // Filter out incomplete triples
            .filter(group -> group.size() == 3)
                // Calculate average and filter those > 30
                .map(triple -> {
                    double avg = triple.stream()
                            .collect(averagingDouble(BigDecimal::doubleValue));
                    return new AbstractMap.SimpleEntry<>(triple, avg);
                })
                .filter(entry -> entry.getValue() <= 30.0)
                // Get the original triples (flattened)
                .flatMap(entry -> entry.getKey().stream())
                // Normalize each value and flatten optionals
                .map(normalizer::normalize)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

        return result.stream();
    }
}