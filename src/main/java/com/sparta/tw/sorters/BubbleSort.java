package com.sparta.tw.sorters;

import java.util.Arrays;

public class BubbleSort implements Sorter{

    public int[] sortArray(int[] injectedArray){
        int temp;
        Boolean change;
        do {
            change = false;
            for (int i = 0; i < injectedArray.length - 1; i++){
                if (injectedArray[i] > injectedArray[i + 1]){
                    temp = injectedArray[i + 1];
                    injectedArray[i + 1] = injectedArray[i];
                    injectedArray[i] = temp;
                    change = true;
                }
            }
        } while (change);
        return injectedArray;
    }

}
