package LabWork6;

public class IntToOctString {

    public static void main(String[] args) {
        // Test cases with valid inputs
        testIntToOctString(511); // Expected: "777"
        testIntToOctString(8);   // Expected: "10"
        testIntToOctString(0);   // Expected: "0"

        // Test cases with invalid inputs
        try {
            testIntToOctString(-1); // Expected: IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception for invalid input: " + e.getMessage());
        }

        try {
            testIntToOctString(Integer.MIN_VALUE); // Expected: IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception for invalid input: " + e.getMessage());
        }
    }

    /**
     * Converts an integer to its octal string representation.
     *
     * @param i the integer to convert
     * @return the octal string representation of the integer
     * @throws IllegalArgumentException if the input is negative
     */
    public static String intToOctString(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }
        return Integer.toOctalString(i);
    }

    /**
     * Helper method to test the intToOctString method.
     *
     * @param i the integer to convert
     */
    private static void testIntToOctString(int i) {
        System.out.println("Input: " + i + " => Octal: " + intToOctString(i));
    }
}

