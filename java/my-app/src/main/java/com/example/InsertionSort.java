package com.example;

public class InsertionSort {
    public static void sort(double[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            double key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void printArray(double[] arr) {
        for (double num : arr) {
            System.out.println(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        double[] arr = {12, 3.5, 7, 1.2, 5};
        System.out.println("Original array:");
        printArray(arr);
        sort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
