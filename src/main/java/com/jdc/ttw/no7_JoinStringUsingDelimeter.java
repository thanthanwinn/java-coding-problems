package com.jdc.ttw;

public class no7_JoinStringUsingDelimeter {
	public static void main(String[] args) {
		System.out.println(join(new String[] {"Hello", "World","Something"}, " "));
	}
	
	public static String join(String[] str, String delimiter) {
		/* create new String every concatenation and cost a lot of memory and time
		String newStr = "";
		for(String s : str) {
			newStr += s.concat(delimiter);	
		}
		return newStr;
		*/
		
		// use StringBuilder to reduce memory and time
		StringBuilder sb = new StringBuilder();
		for (String s : str) {
			sb.append(s).append(delimiter);
		}	
		return sb.toString();
		
	}

}
