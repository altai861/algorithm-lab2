package com.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FindMaxDivideConquerTest {
    @Test
    public void testAlreadySortedArray() {
        double[] arr = {1.0, 2.0, 3.0, 4.0};
        double max = BiggestNumber.findMaxRecursive(arr, 0, arr.length - 1);

        assertEquals(4.0, max);
    }

    @Test
    public void testUnsortedArray() {
        double[] arr = {12, 3.5, 7, 1.2, 5};
        double max = BiggestNumber.findMaxRecursive(arr, 0, arr.length - 1);

        assertEquals(12, max);
    }

    @Test
    public void testArrayWithDuplicates() {
        double[] arr = {4.0, 2.0, 4.0, 1.0};
        double max = BiggestNumber.findMaxRecursive(arr, 0, arr.length - 1);

        assertEquals(4.0, max);
    }

    @Test
    public void testSingleElementArray() {
        double[] arr = {5.0};
        double max = BiggestNumber.findMaxRecursive(arr, 0, arr.length - 1);

        assertEquals(5.0, max);
    }

    @Test
    public void testEmptyArray() {
        double[] arr = {};
        Double max = BiggestNumber.findMaxRecursive(arr, 0, arr.length - 1);

        assertNull(max);
    }
}
