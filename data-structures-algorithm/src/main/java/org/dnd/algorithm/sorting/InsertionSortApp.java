package org.dnd.algorithm.sorting;

import java.util.Arrays;

/**
 * From left to right sorted portion
 * consider 0 is sorted portion,
 * bring in 1 in sorted portion and compare with 0 and swap if required,
 * bring in 2 in sorted portion and compare with 1 till 0 and swap if required in each comparison,
 * bring in 3 in sorted portion and compare with 2 till 0 and swap if required in each comparison,
 * bring in n in sorted portion and compare with n-1 till 0 and swap if required in each comparison.
 */
public class InsertionSortApp {
    public static void main(String[] args) {
        int[] arr = {25,47,3,3,19,8,8,18};
        int[] sortedArray = insertionSort(arr);
        System.out.println("Sorted Array - "+ Arrays.toString(sortedArray));
    }

    private static int[] insertionSort(int[] arr){
        for (int i=1; i<arr.length; i++){
            for (int j=i; j>0; j--){
                if (arr[j-1]>arr[j]){
                    swap(arr, j);
                }
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j -1];
        arr[j -1] = temp;
    }
}
