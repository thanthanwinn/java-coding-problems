package com.jdc.ttw;

import java.util.Arrays;

public class no6_ReversingLetterAndWords {
	public static void main(String[] args) {
		reverse2("hello java developer");
	}
	
	public static void reverse(String str) {
		String[] words = str.split(" ");
		String[] reversedWords = new String[words.length];
		for(int i = 0 ; i < words.length;i ++) {
			char[] charArray = words[i].toCharArray();
			char[] reversedCharArray = new char[charArray.length];
			for(int j = 0 ; j < charArray.length; j++) {
				reversedCharArray[j] = charArray[charArray.length-1-j];
			}
			reversedWords[i] = new String(reversedCharArray);
            }
		System.out.println(Arrays.toString(reversedWords));
		
		
	}
	public static void reverse2(String str) {
		char[] chars = str.toCharArray();
		char[] reversedChars = new char[chars.length];
		for(int i = 0; i < str.length() ; i++) {
			reversedChars[chars.length-1-i] = chars[i];

		}
		System.out.println(Arrays.toString(reversedChars));
	}
	
		
		
		
			
		
		
     
	
}	
					
		
