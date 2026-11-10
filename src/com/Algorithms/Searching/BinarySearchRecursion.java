package com.Algorithms.Searching;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int [] arr= {21, 23, 34, 45, 56, 66, 67, 78, 90};
        int num=21;
        System.out.println(search(num, arr, 0, arr.length-1));;
    }

    private static int search(int num, int[] arr, int s, int e) {

        if(s > e ){
            return -1;
        }

        int mid= s + (e-s)/2;

        if(arr[mid] == num){
            return mid;
        }

        if(num < arr[mid]){
            return search(num, arr, s, mid-1);
        }


        return search(num, arr, mid+1, e);
    }
}
