package org.dnd.algorithm.search;

public class LinearSearchApp {
    public static void main(String[] args) {
        int[] arr = {31,45,54,61,99,23,9,3,77};
        int searchValue = 99;
        int index = linearSearchRecursion(arr, searchValue,0);
        if (index==-1){
            System.out.println(searchValue+" is not in array");
        }else {
            System.out.println(searchValue+" is at "+index);
        }
    }

    private static int linearSearch(int[] arr, int searchValue) {
        for (int i=0;i<arr.length;i++){
            if (arr[i]==searchValue){
                return i;
            }
        }
        return -1;
    }

    private static int linearSearchRecursion(int[] arr, int searchValue, int i){
        if (i<arr.length){
            if (arr[i]==searchValue){
                return i;
            }else {
                return linearSearchRecursion(arr,searchValue,++i);
            }
        }else {
            return -1;
        }
    }
}
