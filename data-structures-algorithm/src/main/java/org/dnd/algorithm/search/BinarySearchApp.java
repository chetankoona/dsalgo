package org.dnd.algorithm.search;

public class BinarySearchApp {
    public static void main(String[] args) {
        int[] arr = {2, 30, 40, 50, 78, 80, 85, 90, 95, 100, 101};
        int searchValue = 101;
        int index = binarySearch(arr,searchValue,0,arr.length-1);
        if (index==-1){
            System.out.println(searchValue+" is not in array");
        }else {
            System.out.println(searchValue+" is at "+index);
        }
    }

    public static int binarySearch(int[] arr, int searchValue, int start, int end){
        while (start<=end){
            int middle = (start+end)/2;
            if (arr[middle]==searchValue){
                return middle;
            }else if (arr[middle]>searchValue){
                end = middle-1;
            }else {
                start=middle+1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursion(int[] arr, int searchValue, int start, int end){
        if (start<=end){
            int middle = (start+end)/2;
            if (arr[middle]==searchValue){
                return middle;
            }else if (arr[middle]>searchValue){
                end = middle-1;
                return binarySearchRecursion(arr,searchValue,start,end);
            }else {
                start=middle+1;
                return binarySearchRecursion(arr,searchValue,start,end);
            }
        }else {
            return -1;
        }
    }
}
