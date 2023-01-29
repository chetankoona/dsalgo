package org.dnd.problems.array;

/**
 * You are given an int array height of length n.
 * There are n vertical lines drawn such that the two endpoints of the i'th line are i,0 & i,height[i].
 * Find the two lines together with x-axis form a container, such that the container contains the most water(depth is constant accross containers).
 * Return the area of container which can store the max amount of water.
 * Notice that you may not slant the container
 */
public class ContainerWater {
    public static void main(String[] args) {
//        int[] arr = {1,5,6,3,4};
        int[] arr = {3,7,5,6,8,4};
        int area = findMaxArea(arr);
        System.out.println("Max Area - "+area);
    }

    /**
     * Brute force method - O(n square)
     * calculate area between 0 & 1 2 3 ... n NEXT 1 & 2 3 4 ... n till n-1 & n and record max area.
     * @param arr
     * @return
     */
    private static int findMaxAreaBruteForce(int[] arr) {
        int area = 0;
        int length = arr.length;
        if (length >1){
            for (int i=0;i<length-1;i++){
                for (int j=i+1;j<length;j++){
                    int height = arr[i]<arr[j]?arr[i]:arr[j];
                    int currentArea = height*(j-i);
                    if (area<currentArea){
                        area = currentArea;
                    }
                }
            }
        }
        return area;
    }

    /**
     * Method 2 - Two shifting pointers
     * point i to 0 & j to n, calculate area and record.
     * min of i,j to shift and calculate area and record.
     * do till i<j
     * @param arr
     * @return
     */
    private static int findMaxArea(int[] arr){
        int area = 0;
        if (arr.length >1){
            int i=0;
            int j=arr.length-1;
            while (i<j){
                int height = arr[i]<arr[j]?arr[i]:arr[j];
                int currentArea = height*(j-i);
                if (area<currentArea){
                    area = currentArea;
                }
                if (arr[i]<arr[j]){
                    ++i;
                }else {
                    --j;
                }
            }
        }
        return area;
    }
}
