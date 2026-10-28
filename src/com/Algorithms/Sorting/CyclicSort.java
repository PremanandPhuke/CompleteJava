package com.Algorithms.Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr=  {3, 1, 4, 5, 2};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclic(int[] arr){
        int i=0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                int temp= arr[i];
                arr[i]= arr[correctIndex];
                arr[correctIndex]=temp;
            }
            else {
                i++;
            }
        }
    }
}
