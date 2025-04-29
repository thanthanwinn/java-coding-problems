package com.jdc.ttw;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class no9_removeDuplicates {
    public static void main(String[] args) {
        String str = "abbdd";
        System.out.println( removeDuplicates2(str));
    }
    public static String removeDuplicates(String str) {
        char[] ch = str.toCharArray();
        HashSet<Character> set = new HashSet<Character>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if(set.add(ch[i])){
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }

    public static String removeDuplicates2(String str) {
        return Arrays.asList(str.split("")).stream()
                .distinct()
                .collect(Collectors.joining());
    }
}
