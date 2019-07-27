package com.inrhythm.test;

public class Main {

	public static void main(String[] args) {

        // Use sentence from arguments or the default sentence
        String sentence = "";
        if(args.length > 0) {
            // Join arguments to sentence
            sentence = String.join(" ", args);
        } else {
            // If no arguments then use default sentence
            sentence ="The cow jumped over the car.";
        }

        // Find longest word. Return result object
        LongestWord result = StringUtils.getLongestWord(sentence);

        // Print values for longest word and length
        System.out.println(result.getLongestWord());
        System.out.println(result.getLength());
    }
}

