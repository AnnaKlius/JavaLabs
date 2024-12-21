package LabWork6;

public class SentenceWordCapitalizer {

    public static void main(String[] args) {
        // Test cases
        try {
            String input1 = "The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago";
            System.out.println(capitalizeWords(input1));

            String input2 = "Hello world123 and java456 programming!";
            System.out.println(capitalizeWords(input2));

            // Edge cases
            String input3 = "12345 and numbers!";
            System.out.println(capitalizeWords(input3)); // Only numbers, no changes to words

            String input4 = "   ";
            System.out.println(capitalizeWords(input4)); // Empty sentence

            System.out.println(capitalizeWords(null)); // Should throw NullPointerException

        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    /**
     * Replaces all words in a sentence with their uppercase equivalents.
     * Words are defined as sequences of alphabetic characters (a-z, A-Z).
     *
     * @param sentence the input string
     * @return a new string with all words in uppercase
     * @throws IllegalArgumentException if the input sentence is invalid
     * @throws NullPointerException if the input is null
     */
    public static String capitalizeWords(String sentence) {
        if (sentence == null) {
            throw new NullPointerException("Input sentence cannot be null");
        }

        if (sentence.trim().isEmpty()) {
            throw new IllegalArgumentException("Input sentence cannot be empty or only whitespace");
        }

        StringBuilder result = new StringBuilder();
        String[] tokens = sentence.split(" ");

        for (String token : tokens) {
            if (token.matches("[a-zA-Z]+")) {
                result.append(token.toUpperCase());
            } else {
                result.append(token);
            }
            result.append(" ");
        }

        // Remove the trailing space
        return result.toString().trim();
    }
}

