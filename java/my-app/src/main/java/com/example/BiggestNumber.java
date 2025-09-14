package com.example;

public class BiggestNumber {

    public static Double findMaxRecursive(double[] arr, int left, int right) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        if (left == right) {
            return arr[left];
        }

        int mid = (left + right) / 2;

        double maxLeft = findMaxRecursive(arr, left, mid);
        double maxRight = findMaxRecursive(arr, mid + 1, right);

        return Math.max(maxLeft, maxRight);
    }
    public static void main(String args[]) {
        double[] arr = {1, 23, 4, 1, 123};
        double biggest = findMaxRecursive(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println("\nThe biggest element is: " + biggest);
    }
}
