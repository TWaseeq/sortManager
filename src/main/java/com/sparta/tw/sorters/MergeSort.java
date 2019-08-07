package com.sparta.tw.sorters;

import java.util.Arrays;

public class MergeSort implements Sorter {

    @Override
    public int[] sortArray(int[] array) {
        splitArray(array);
        return array;
    }

    public void splitArray(int[] arrayToSplit) {
        int mid = arrayToSplit.length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[arrayToSplit.length - mid];

        if (arrayToSplit.length < 2) {
            return;
        }
        for (int i = 0; i < mid; i++) {
            leftArray[i] = arrayToSplit[i];
        }
        for (int i = 0; i < arrayToSplit.length - mid; i++) {
            rightArray[i] = arrayToSplit[i + mid];
        }

        splitArray(leftArray);
        splitArray(rightArray);
        mergeArrays(leftArray, rightArray, arrayToSplit);
    }

    public void mergeArrays(int[] leftArray, int[] rightArray, int[] array) {
        int firstArrayCount = 0;
        int secondArrayCount = 0;
        int totalCount = 0;
        int[] finalArray = array;

        while (totalCount < finalArray.length) {

            if (leftArray.length > firstArrayCount && rightArray.length > secondArrayCount) {
                if (leftArray[firstArrayCount] < rightArray[secondArrayCount]) {
                    finalArray[totalCount] = leftArray[firstArrayCount];
                    totalCount++;
                    firstArrayCount++;
                } else if (rightArray[secondArrayCount] <= leftArray[firstArrayCount]) {
                    finalArray[totalCount] = rightArray[secondArrayCount];
                    totalCount++;
                    secondArrayCount++;
                }
            } else if (leftArray.length > firstArrayCount) {
                finalArray[totalCount] = leftArray[firstArrayCount];
                totalCount++;
                firstArrayCount++;
            } else if (rightArray.length > secondArrayCount) {
                finalArray[totalCount] = rightArray[secondArrayCount];
                totalCount++;
                secondArrayCount++;
            }
        }
    }
}