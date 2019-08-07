package com.sparta.tw.sortManagement;

import java.util.Arrays;

public class Starter {
    public static void main(String[] args) {
        int[] input = new int[]{8, 2, 3, 8, 5, 3, 1, 9, 7, 6};

        System.out.println("SORTING ARRAY: " + Arrays.toString(input));
        new SortManager().sortArray(input);
        System.out.println("FINAL RESULT: " + Arrays.toString(input));


    }
}
