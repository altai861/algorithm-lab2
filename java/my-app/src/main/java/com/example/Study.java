package com.example;

import java.util.Arrays;

public class Study {
    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int key = array[i];

            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
    }

    public static int[] merge(int[] left, int[] right) {

        int length = left.length + right.length;
        int[] mergedList = new int[length];

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mergedList[k] = left[i];
                i += 1;
                k += 1;
            } else {
                mergedList[k] = right[j];
                j += 1;
                k += 1;
            }
        }

        
        while (i < left.length) {
            mergedList[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            mergedList[k] = right[j];
            j++;
            k++;
        }

        return mergedList;
    }

    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;
        int[] leftHalf = mergeSort(Arrays.copyOfRange(array, 0, mid));
        int[] rightHalf = mergeSort(Arrays.copyOfRange(array, mid, array.length));

        return merge(leftHalf, rightHalf);
    }

    public static int binarySearch(int[] array, int target, int l, int r) {
        if (l > r) {
            return -1;
        }

        int mid = (l + r) / 2;

        if (target == array[mid]) {
            return mid;
        } else if (target < array[mid]) {
            return binarySearch(array, target, l, mid - 1);
        } else {
            return binarySearch(array, target, mid + 1, r);
        }
    }

    public static int findMax(int[] array, int l, int r) {
        if (l == r) {
            return array[l];
        }

        int mid = (l + r) / 2;
        int max_left = findMax(array, l, mid);
        int max_right = findMax(array, mid + 1, r);

        return Math.max(max_left, max_right);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 31, 1, 31, 123, 34, 3, 99, 0};

        insertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("\n");


        int[] mergeArr = {1, 2, 31, 1, 31, 123, 34, 3, 99, 0};

        int[] result = mergeSort(mergeArr);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }
        System.out.println("\n");


        System.out.println(binarySearch(result, 99, 0, result.length));

        System.out.println(findMax(result, 0, result.length - 1));
    }
}
