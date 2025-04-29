package com.jdc.ttw;

public class no3_CountingVowelsAndConsonents {
	public static void main(String[] args) {
		count("Helloo");
	}
	
	public static void count(String str) {
		str = str.toLowerCase();
		int vowels = 0;
		int consonents = 0;
		for(int i = 0; i<str.length();i++) {
			char c = str.charAt(i);
			if("aeiou".contains(String.valueOf(str.charAt(i)))) {
				vowels++;
			}else if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				consonents++;
			}
		}
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonents: " + consonents);
	}

}
