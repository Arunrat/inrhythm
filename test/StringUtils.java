package com.inrhythm.test;

public class StringUtils {

	public static LongestWord getLongestWord(String sentence) {
        // Split sentence. Use space as delimiter
        String[] words = sentence.split(" ");

        // Define value for length comparation
        int lengthToCompare = 0;

        // Initialize result object
        LongestWord result = new LongestWord();

        // Iterate through all words
        for(String word : words) {
            // If current word is longer than longest word so far then store it in the result object
            if(word.length() > lengthToCompare) {
                // Update value for length comparation
                lengthToCompare = word.length();

                // Update length and word in result object
                result.setLongestWord(word);
                result.setLength(lengthToCompare);
            }
        }

        return result;
    }
}
