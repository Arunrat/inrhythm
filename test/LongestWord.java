package com.inrhythm.test;

public class LongestWord {

	  private String longestWord;
	    private int length;

	    // Constructor. Set default return values to 0 and empty string
	    public LongestWord() {
	        this.longestWord = "";
	        this.length = 0;
	    }

	    // Getter and setter methods for class fields
	    public String getLongestWord() {
	        return longestWord;
	    }

	    public void setLongestWord(String longestWord) {
	        this.longestWord = longestWord;
	    }

	    public int getLength() {
	        return length;
	    }

	    public void setLength(int length) {
	        this.length = length;
	    }
	}

