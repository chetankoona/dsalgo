package org.dnd.problems.array;

import java.util.Arrays;

/**
 * Rotate array k times
 * If array is empty return empty array
 * rotateTimes % arr.length will avoid error if rotateTimes is greater than arr.length
 * Main logic: construct new array by placing an element in current + rotateTimes location [TC O(n), SC O(n)]
 *
 * Method 1 - store last k elemenets in temp arr, then shift first len - k elements by k to right [TC O(n), SC O(k)]
 * Method 2 - reverse whole arr, reverse first k elements, then reverse k+1 to len. [TC O(n), SC O(1)]
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int rotateTimes = 12;
        int[] resultArr = rotateArray(arr,rotateTimes);
        System.out.println(Arrays.toString(resultArr));
    }

    private static int[] rotateArray(int[] arr, int rotateTimes) {
        if (arr.length==0){
            return arr;
        }
        rotateTimes = rotateTimes%arr.length;
        if (rotateTimes==0){
            return arr;
        }
        int[] resultArr = new int[arr.length];
        for (int i=0; i<arr.length; i++){
            int targetIndex = i+rotateTimes;
            if (targetIndex>=arr.length){
                targetIndex = targetIndex-arr.length;
            }
            resultArr[targetIndex] = arr[i];
        }
        return resultArr;
    }
}
