package com.jdc.ttw;

public class FindMaxAndMin {
    public static void main(String[] args) {
        int[] arr = {8,3,2,5,4,8,9,6};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max + " " + min);

    }
}
