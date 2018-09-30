package org.mackenzie;

public class CarryOperations {

    public static int numberOfCarryOperations(int a, int b) {
        int numberOfCarryOperations = 0;
        int lastCarry = 0;

        do {
            int aDigit = a % 10;
            int bDigit = b % 10;
            int sum = aDigit + bDigit + lastCarry;

            if (sum > 9) {
                numberOfCarryOperations++;
                lastCarry = sum / 10;
            } else {
                lastCarry = 0;
            }
            a /= 10;
            b /= 10;
        } while(a > 0 || b > 0);

        return numberOfCarryOperations;
    }
}
