package com.Algorithms.Searching;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int [] arr= {-18, -12, -4, -1, 0, 2, 4, 6, 24, 34, 50};
        int target= 24;
        System.out.println("=====================");
        System.out.println(binarySearch(arr, target)>0?"Taregt found at index: "+binarySearch(arr, target): "Target Not Found");
        System.out.println("=====================");

    }

    static int binarySearch(int [] arr, int target){

        int start=0;
        int end= arr.length -1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start= mid+1;
            }
            else if (target < arr[mid]){
                end = mid -1;
            }
            else {
                // target found
                return mid;
            }
        }

        return -1;
    }
}
