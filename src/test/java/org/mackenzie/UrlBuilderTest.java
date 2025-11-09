package org.mackenzie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UrlBuilderTest {

    private UrlBuilder builder;

    @BeforeEach
    public void setUp() {
        this.builder = new UrlBuilder();
    }

    @Test
    void defaultProtocolHostOnly() {
        String url = builder
                .host("www.google.com")
                .build();

        Assertions.assertEquals("http://www.google.com", url);
    }

    @Test
    void httpsHostOnly() {
        String url = builder
                .https()
                .host("www.google.com")
                .build();

        Assertions.assertEquals("https://www.google.com", url);
    }
}
