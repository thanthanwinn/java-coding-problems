package com.jdc.ttw;

public class no8_isPalindrome {
    public static void main(String[] args) {
         String str = "tot";
        System.out.println( isPalindrome(str));

    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    //make the string reverse and check if the original string is equals to reversed string;
}
