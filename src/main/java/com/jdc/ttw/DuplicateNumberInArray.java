package com.jdc.ttw;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumberInArray {
    public static void main(String[] args) {
        int[] arr = { 1,3,7,2,5,3,9,2};
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(!set.add(arr[i])) {
                duplicates.add(arr[i]);
            }
        }
        System.out.println(duplicates);
    }
}
