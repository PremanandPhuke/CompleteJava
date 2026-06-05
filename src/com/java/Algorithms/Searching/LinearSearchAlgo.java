package com.java.Algorithms.Searching;

public class LinearSearchAlgo {

    public static void main(String[] args) {

        LinearSearchAlgo temp= new LinearSearchAlgo();

        int[] arr = {12, 23, 32, 19, 98};

        int target= 23;

        int index= temp.linearSearch(arr, target);

        System.out.println("==============================");

        if(index == -1){
            System.out.println("Element Not in the array");
        }
        else {
            System.out.println("Element found at: "+index);
        }
        System.out.println("==============================");

    }

    public int linearSearch(int [] arr, int target){

        int n= arr.length;

        for(int i=0; i<n; i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }
}

