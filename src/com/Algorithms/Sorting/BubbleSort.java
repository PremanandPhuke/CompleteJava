package com.Algorithms.Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr=  {12, 1, 23, 11, 24};
        Bubble(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void Bubble(int[] arr){
         for(int i=0; i < arr.length; i++){
             for(int j=1; j < arr.length -i; j++){

                 if(arr[j] < arr[j-1]){
                     int temp = arr[j];
                     arr[j]= arr[j-1];
                     arr[j-1]= temp;

                 }
             }
         }
    }

}
