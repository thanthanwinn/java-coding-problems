package com.jdc.ttw;

public class Vowels {
    public static void main(String[] args) {
        String str = "hello";
        char[] chars = str.toCharArray();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            if("aeiou".indexOf(chars[i]) >= 0){
                vowels++;
            }else{
                consonants++;
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
    }
}
