package org.mackenzie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.math.BigDecimal;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

class SamplePreprocessorTest {

    private SamplePreprocessor preprocessor;
    private SampleNormalizer normalizer;

    @BeforeEach
    public void setUp() {
        this.normalizer = new SampleNormalizer();
        this.preprocessor = new SamplePreprocessor(normalizer);
    }

    @Test
    void test1() {
        Stream<BigDecimal> preprocess = preprocessor.preprocess(Stream.of(BigDecimal.ONE, BigDecimal.ONE, BigDecimal.ONE));

        Assertions.assertEquals(0, preprocess.count());
    }

    @Test
    void test2() {
        Stream<BigDecimal> preprocess = preprocessor.preprocess(Stream.of(BigDecimal.valueOf(6), BigDecimal.valueOf(6), BigDecimal.valueOf(6)));

        Assertions.assertEquals(0, preprocess.count());
    }

    @Test
    void test3() {
        Stream<BigDecimal> preprocess = preprocessor.preprocess(Stream.of(BigDecimal.valueOf(11), BigDecimal.valueOf(11), BigDecimal.valueOf(11)));

        Assertions.assertEquals(0, preprocess.count());
    }

    @Disabled
    @Test
    void test4() {
        Stream<BigDecimal> preprocess = preprocessor.preprocess(Stream.of());

        Assertions.assertEquals(1, preprocess.count());
    }
}
