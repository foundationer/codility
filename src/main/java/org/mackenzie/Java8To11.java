package org.mackenzie;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.function.Predicate.*;

public class Java8To11 {

    public boolean doesStringContainVisibleCharacters(String input) {
        // Java 11 introduced a special String's method that could replace the expression below
        return !input.isBlank();
    }

    public List<String> splitToLines(String input) {
        // Java 11 introduced a special String's method that could replace the expression below
        return input.lines().collect(Collectors.toList());
    }

    public String trimUnicodeString(String input) {
        // Java 11 introduced a special String's method that could replace the expression below
        // Note: The final implementation should operate on wider spectrum of whitespace characters than trim method
        return input.strip();
    }

    public String trimLeft(String input) {
        // Java 11 introduced a special String's method that could replace the expression below
        return input.stripLeading();
    }

    public String trimRight(String input) {
        // Java 11 introduced a special String's method that could replace the expression below
        return input.stripTrailing();
    }

    public String repeatStringFiveTimes(String input) {
        // Java 11 introduced a special String's method that could replace the expression below
        return input.repeat(5);
    }

    public void saveStringInFile(String fileContents, String filename) throws Exception {
        Path file = Paths.get(filename);
        Files.writeString(file, fileContents);
    }

    public String readFileContents(String filename) throws Exception {
        Path file = Paths.get(filename);
        return Files.readString(file);
    }

    public List<String> filterOutEmptyStrings(List<String> input) {
        // Java 11 introduces new type of Predicate - please use it here
        return input.stream()
                .filter(not(String::isBlank))
                .collect(Collectors.toList());
    }
}
