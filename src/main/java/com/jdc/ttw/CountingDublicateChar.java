package com.jdc.ttw;

import java.util.Arrays;

public class CountingDublicateChar {
	public static void main(String[] args) {
		
		countChar("hello world", 'o');
	}
	
	public  static void countChar(String str, char c) {
		char[] arr = new char[str.length()];

		for(int i=0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		int count = 0;
		for(int i = 0; i< arr.length; i++) {
			
				if (c == arr[i]) {
					count++;
			}
		}
		if(c == ' ') {
			System.out.print("Space character contains in string  "+ str +" for "+ count + " time");
		}else {
		System.out.print( c + " character contains in string  "+ str +" for "+ count + " time");
		}
		if (count > 1) {
			System.out.println("s");
		}
	
	}

}
