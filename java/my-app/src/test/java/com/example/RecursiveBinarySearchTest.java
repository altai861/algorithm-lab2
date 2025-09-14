package com.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RecursiveBinarySearchTest {

    @Test
    public void testAlreadySortedArray() {
        double[] arr = {1.0, 2.0, 3.0, 4.0};
        MergeSort.sort(arr);

        int index = MergeSort.recursiveBinarySearch(arr, 4.0, 0, arr.length - 1);

        assertEquals(3, index);
    }

    @Test
    public void testUnsortedArray() {
        double[] arr = {12, 3.5, 7, 1.2, 5};
        MergeSort.sort(arr);
        
        int index = MergeSort.recursiveBinarySearch(arr, 4.0, 0, arr.length - 1);

        assertEquals(-1, index);
    }

    @Test
    public void testArrayWithDuplicates() {
        double[] arr = {4.0, 2.0, 4.0, 1.0};
        MergeSort.sort(arr);
        
        int index = MergeSort.recursiveBinarySearch(arr, 4.0, 0, arr.length - 1);

        int[] poss = {2, 3};

        boolean inside = false;

        for (int n : poss) {
            if (n == index) {
                inside = true;
                break;
            }
        }

        assertTrue(inside);
    }

    @Test
    public void testSingleElementArray() {
        double[] arr = {5.0};
        MergeSort.sort(arr);
        
        int index = MergeSort.recursiveBinarySearch(arr, 5.0, 0, arr.length - 1);

        assertEquals(0, index);
    }

    @Test
    public void testEmptyArray() {
        double[] arr = {};
        MergeSort.sort(arr);
        
        int index = MergeSort.recursiveBinarySearch(arr, 4.0, 0, arr.length - 1);

        assertEquals(-1, index);
    }

}
