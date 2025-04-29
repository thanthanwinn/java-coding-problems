package com.jdc.ttw;

import java.util.HashSet;
import java.util.Set;

public class GeneratingPermutations {
	public static void main(String[] args) {
		permute("123");
    }
	
	public static void permute(String str) {
		char[] chars = str.toCharArray();

		for(int i=0; i<chars.length; i++) {
			for(int j=0; j < chars.length; j++) {
				if(chars[i] != chars[j]) {
					System.out.print(chars[i] );
					System.out.print(chars[j] );
					for(int k=0; k<chars.length; k++) {
						if(chars[i]!= chars[k] && chars[j] != chars[k]) {
							System.out.print(chars[k]);
						}
					}
					System.out.println();
				}





			}
		}
		
	}


}
