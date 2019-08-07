package com.sparta.tw;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.sparta.tw.sortManagement.SortManager;
import com.sparta.tw.sorters.BubbleSort;
import com.sparta.tw.sorters.SortFactory;
import com.sparta.tw.sorters.Sorter;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class bubbleSortTester {
    /**
     * Rigorous Test :-)
     */

    int[] testArray = new int[]{2, 5, 1, 7, 4, 8};
    int[] testArrayDups = new int[]{2, 7, 8, 2, 7, 1, 1, 8, 7};
    int[] testArrayOdd = new int[]{78, 5343, 293, 1023, 5};


    BubbleSort bubbleSort = new BubbleSort();
    SortManager sortManager = new SortManager();
    Sorter sorter = SortFactory.getInstance("Bubble");


    @Test
    public void testArrayLength() {
        int[] sortedArray = bubbleSort.sortArray(testArray);
        assertTrue(testArray.length == sortedArray.length);
    }

    @Test
    public void bsValueChecker() {
        int[] sortedArray = bubbleSort.sortArray(testArray);
        for (int i = 0; i < testArray.length - 1; i++) {
            assertTrue(sortedArray[i] <= sortedArray[i + 1]);
        }
    }

    @Test
    public void bsNullChecker() {
        bubbleSort.sortArray(testArray);
        Assert.assertNotNull(testArray);
    }

    @Test
    public void bsDuplicateChecker() {
        int[] sortedArray = sortManager.sortArray(testArrayDups);
        for (int i = 0; i <= testArray.length - 1; i++) {
            assertTrue(sortedArray[i] <= sortedArray[i + 1]);
        }
    }


}




