package org.mackenzie;

import java.math.BigDecimal;
import java.util.Optional;

public class SampleNormalizer {

    public Optional<Optional<BigDecimal>> normalize(BigDecimal bd) {
        if (bd == null) {
            return Optional.empty();
        }

        // Filter out values less than 5
        if (bd.compareTo(BigDecimal.valueOf(15)) < 0) {
            return Optional.of(Optional.empty());
        }

        Optional<BigDecimal> normalized = Optional.of(bd);
        return Optional.of(normalized);
    }
}
