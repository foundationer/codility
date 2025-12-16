package org.mackenzie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpandStringTest {

    @Test
    public void expandEmptyString() {
        assertEquals("", ExpandString.expandString(""));
    }

    @Test
    public void expandStringWithoutGroups() {
        assertEquals("a", ExpandString.expandString("a"));
    }

    @Test
    public void expandMultipleGroups() {
        assertEquals("ababcccd", ExpandString.expandString("2[ab]3[c]1[d]"));
    }
}
