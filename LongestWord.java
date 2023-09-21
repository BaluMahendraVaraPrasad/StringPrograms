package com.string.pack;

public class LongestWord {
    public static String longestWord(String sen) {
        String longestWord = "";
        int longestLength = 0;

        String word = "";
        int wordLength = 0;

        for (int i = 0; i < sen.length(); i++) {
            char c = sen.charAt(i);

            // Check if the character is a letter or digit
            if (isLetterOrDigit(c)) {
                word += c;
                wordLength++;
            } else if (c == ' ' || i == sen.length() - 1) {
                // Check if the current word is longer than the longest word found so far
                if (wordLength > longestLength) {
                    longestWord = word;
                    longestLength = wordLength;
                }

                word = "";
                wordLength = 0;
            }
        }

        return longestWord;
    }

    // Helper method to check if a character is a letter or digit
    public static boolean isLetterOrDigit(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    public static void main(String[] args) {
        System.out.println(longestWord("fun&!! time"));
        // Output: time

        System.out.println(longestWord("I love dogs"));
        // Output: love
    }
}
