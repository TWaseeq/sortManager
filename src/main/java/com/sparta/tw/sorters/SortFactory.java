package com.sparta.tw.sorters;

public class SortFactory {

    public static Sorter getInstance(String sorter) {
        if (sorter.equalsIgnoreCase("bubble")) {
            return new BubbleSort();
        }
        if (sorter.equalsIgnoreCase("merge")) {
            return new MergeSort();
        }
        return new BubbleSort();
    }
}