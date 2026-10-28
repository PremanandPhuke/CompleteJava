package com.Algorithms.Sorting;

import java.util.Arrays;

public class SeelctionSort {
    public static void main(String[] args) {
        int [] arr= {55, 4, 21, 2, 1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int []arr){

        // This loop each pass
        for(int i=0; i< arr.length; i++){

            // This will find the last element for rach pass and for every pass its value reduced by 1
            int last= arr.length - 1 - i;

            // This will find maximum index to swap with last element
            int max= maxIndex(arr, 0, last);

            // swap the largest with last element
            swap(arr, max, last);

        }
    }

    static int maxIndex(int[]arr, int start,int last){

        int max= start;
        for(int i=0; i<=last; i++){
                if(arr[max] < arr[i]){
                    max= i;
                }
        }
        return max;
    }

    static void swap(int[] arr, int max, int last){
        int temp= arr[max];
        arr[max]= arr[last];
        arr[last]= temp;
    }
}
