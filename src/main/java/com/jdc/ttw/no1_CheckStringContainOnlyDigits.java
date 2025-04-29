package com.jdc.ttw;

public class no1_CheckStringContainOnlyDigits {
	
	public static void main(String[] args) {
		System.out.println(check("123q"));
	}
	
	public static boolean check(String str) {
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}
		

}
