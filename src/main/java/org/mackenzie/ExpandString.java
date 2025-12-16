package org.mackenzie;

class ExpandString {

    public static String expandString(String input) {
        char[] chars = input.toCharArray();
        int expansionSize = 0;
        boolean inGroup = false;
        StringBuilder builder = new StringBuilder();
        StringBuilder currentGroup = new StringBuilder();

        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                expansionSize = Character.getNumericValue(aChar);
            }
            if (aChar == '[') {
                inGroup = true;
            }
            if (Character.isAlphabetic(aChar) && inGroup) {
                // if group started collect chars in group string builder
                currentGroup.append(aChar);
            }
            if (aChar == ']') {
                // group finished, append current group as many times as the expansion size
                for (int j = 0; j < expansionSize; j++) {
                    builder.append(currentGroup);
                }
                expansionSize = 0;
                inGroup = false;
                currentGroup.delete(0, currentGroup.length());
            }
            if (Character.isAlphabetic(aChar) && !inGroup) {
                // if char is not part of a group, append directly to the main string builder
                builder.append(aChar);
            }
        }
        return builder.toString();
    }
}
