package org.dnd.problems.array;

/**
 * Monotonic Array
 * An array is monotonic when it is either monotonic increasing or monotonic decreasing,
 * An array is monotonic increasing if all its elements from left to right is non-decreasing,
 * An array is monotonic decreasing if all its elements from right to left is non-increasing,
 * Given an integer array return true if given array is monotonic, or false otherwise.
 */
public class MonotonicArray {
    public static void main(String[] args) {
        int[] arr = {5,5,4,3,2,1,1};
        boolean result = isMonotonic(arr);
        System.out.println(result);
    }

    private static boolean isMonotonic(int[] arr) {
        boolean isInc = false;
        boolean isDec = false;
        int index = 0;
        while (index<arr.length-1){
            int cur = arr[index];
            int next = arr[index+1];
            if ((isInc && cur>next) || (isDec && cur<next)){
                return false;
            } else if (cur<next) {
                isInc = true;
            } else if (cur>next) {
                isDec = true;
            }
            ++index;
        }
        return true;
    }
}
