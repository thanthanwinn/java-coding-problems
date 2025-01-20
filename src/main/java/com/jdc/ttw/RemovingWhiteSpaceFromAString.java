package com.jdc.ttw;

public class RemovingWhiteSpaceFromAString {
	public static void main(String[] args) {
		System.out.println(remove("Hello World"));
	}
	
	public static String remove(String str) {
		return str.replaceAll("\\s", "");
		
	}

}
