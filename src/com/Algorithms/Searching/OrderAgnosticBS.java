package com.Algorithms.Searching;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int [] arr1= {100, 100, 90, 78, 67, 56, 34, 23, 10, 10};
        int [] arr2= {12, 12, 23, 34, 45, 56, 67, 78, 100, 100};

        int target = 67;
        System.out.println("=====================");
        if(Order(arr2)){
            System.out.println(AscendingBS(arr2, target)>0?"Taregt found at index: "+AscendingBS(arr2, target): "Target Not Found");

        }
        else{
            System.out.println(DescendingBs(arr2, target)>0?"Taregt found at index: "+DescendingBs(arr2, target): "Target Not Found");
        }
        System.out.println("=====================");
    }

    static boolean Order (int [] arr){

        int start= arr[0];
        int end= arr[arr.length-1];

        return start<end;
    }

    static int AscendingBS(int[] arr, int target){
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

    static int DescendingBs(int[] arr, int target){
        int start=0;
        int end= arr.length -1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                end= mid-1;
            }
            else if (target < arr[mid]){
                start= mid+1;
            }
            else {
                // target found
                return mid;
            }
        }

        return -1;
    }
}
