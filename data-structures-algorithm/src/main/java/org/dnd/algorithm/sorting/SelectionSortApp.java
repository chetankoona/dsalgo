package org.dnd.algorithm.sorting;

import java.util.Arrays;

/**
 * Selection sort:
 * O(n square)
 * Identify minimum value from 0 to n and put to 0,
 * next identify minumum value from 1 to n and put to 1,
 * .
 * .
 * till
 * identify minimum value from n-1 to n and put to n-1.
 */
public class SelectionSortApp {
    public static void main(String[] args) {
        int[] arr = {25,47,3,3,19,8,8,18};
        int[] sortedArray = selectionSort(arr);
        System.out.println("Sorted Array - "+ Arrays.toString(sortedArray));
    }

    private static int[] selectionSort(int[] arr) {
        for (int i=0;i<arr.length;i++){
            int minIndex = i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            if (i!=minIndex){
                swap(arr, i, minIndex);
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int minIndex) {
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}
