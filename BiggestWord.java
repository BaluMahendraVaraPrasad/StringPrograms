package com.string.pack;

public class BiggestWord {
    public static void main(String[] args) {
        String s="Java is not complete oop language";
        String[] words = s.split(" ");
        String biggestWord = "";
        
        for (String word : words) {
            if (word.length() > biggestWord.length() || (word.length() == biggestWord.length() && compareAsciiValues(word, biggestWord) > 0)) {
                biggestWord = word;
            }
        }
        
        System.out.println("The biggest word is: " + biggestWord);
    }
    
    public static int compareAsciiValues(String word1, String word2) {
        int asciiSum1 = 0;
        int asciiSum2 = 0;
        
        for (char c : word1.toCharArray()) {
            asciiSum1 += (int) c;
        }
        
        for (char c : word2.toCharArray()) {
            asciiSum2 += (int) c;
        }
        
        return Integer.compare(asciiSum1, asciiSum2);
    }
}
