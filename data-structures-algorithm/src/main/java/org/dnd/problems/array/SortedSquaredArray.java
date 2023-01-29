package org.dnd.problems.array;

import java.util.Arrays;

/**
 * Sorted squared array.
 * Accepts sorted array of int and returns sorted squared int
 * input array may contain negative values
 */
public class SortedSquaredArray {
    public static void main(String[] args) {
        int[] arr = {-7,-3,0,1,2,4};
        int[] resultArr = method2(arr);
        System.out.println(Arrays.toString(resultArr));
    }

    /**
     * Brute force method,
     * square each element and put in new array and then sort using Arrays.sort()
     * @param arr
     * @return
     */
    private static int[] method1(int[] arr) {
        int[] resultArray = new int[arr.length];
        for (int i=0; i<arr.length; i++){
            int currentValue = arr[i];
            resultArray[i] = currentValue * currentValue;
        }
        Arrays.sort(resultArray);
        return resultArray;
    }

    /**
     * square first and last element and then compare, grater value to put at last in new arr,
     * inc left or dec last index respectively, do until all fills in new array.
     * @param arr
     * @return
     */
    private static int[] method2(int[] arr){
        int[] resultArray = new int[arr.length];
        int left = 0;
        int right = arr.length-1;
        int index = arr.length-1;
        while (index>=0){
            int leftValue = arr[left]*arr[left];
            int rightValue = arr[right]*arr[right];
            if (rightValue>leftValue){
                resultArray[index]=rightValue;
                --right;
            }else {
                resultArray[index]=leftValue;
                ++left;
            }
            --index;
        }
        return resultArray;
    }
}
