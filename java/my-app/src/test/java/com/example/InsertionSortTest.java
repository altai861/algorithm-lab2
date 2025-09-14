package com.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class InsertionSortTest {

    @Test
    public void testAlreadySortedArray() {
        double[] arr = {1.0, 2.0, 3.0, 4.0};
        InsertionSort.sort(arr);
        assertArrayEquals(new double[]{1.0, 2.0, 3.0, 4.0}, arr);
    }

    @Test
    public void testUnsortedArray() {
        double[] arr = {12, 3.5, 7, 1.2, 5};
        InsertionSort.sort(arr);
        assertArrayEquals(new double[]{1.2, 3.5, 5.0, 7.0, 12.0}, arr);
    }

    @Test
    public void testArrayWithDuplicates() {
        double[] arr = {4.0, 2.0, 4.0, 1.0};
        InsertionSort.sort(arr);
        assertArrayEquals(new double[]{1.0, 2.0, 4.0, 4.0}, arr);
    }

    @Test
    public void testSingleElementArray() {
        double[] arr = {5.0};
        InsertionSort.sort(arr);
        assertArrayEquals(new double[]{5.0}, arr);
    }

    @Test
    public void testEmptyArray() {
        double[] arr = {};
        InsertionSort.sort(arr);
        assertArrayEquals(new double[]{}, arr);
    }
}
