package com.example;


public class MergeSort {

   public static void sort(double[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        mergeSort(array, 0, array.length - 1);
    }

    public static void mergeSort(double[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(array, left, mid);

            mergeSort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    public static void merge(double[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        double[] L = new double[n1];
        double[] R = new double[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k++] = L[i++];
            } else {
                array[k++] = R[j++];
            }
        }

        while (i < n1) {
            array[k++] = L[i++];
        }
        while (j < n2) {
            array[k++] = R[j++];
        }
    }

    public static int recursiveBinarySearch(double[] arr, double target, int l, int r) {

        if (l > r) {
            return -1;
        }

        int mid = (l + r) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return recursiveBinarySearch(arr, target, l, mid - 1);
        } else {
            return recursiveBinarySearch(arr, target, mid + 1, r);
        }
    } 

    public static void main(String[] args) {
        double[] numbers = { 38.5, 27.2, 43.9, 3.1, 9.0, 82.6, 10.3 };
        MergeSort.sort(numbers);

        System.out.print("Sorted array: ");
        for (double num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nThe target index: " + recursiveBinarySearch(numbers, 38.5, 0, numbers.length));
    }
}
