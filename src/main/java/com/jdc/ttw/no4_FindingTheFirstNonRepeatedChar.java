package com.jdc.ttw;

public class no4_FindingTheFirstNonRepeatedChar {
	public static void main(String[] args) {
		findFirstNonRepeatChar("hello helen");
		
	}
	
	public static void findFirstNonRepeatChar(String str) {
		char[] charArray = str.toCharArray();
		
			boolean isRepeated;
		for(int i = 0; i< charArray.length;i++) {
			isRepeated = false;
				for(int j =0; j<charArray.length; j++) {
					if( i != j && charArray[i] == charArray[j]) {
						isRepeated = true;
						break;
					}	
				}
				if(!isRepeated) {
					System.out.println(charArray[i]);
					return;
				}	
		}
		System.out.println("no repeat character found");

		
	}

}
