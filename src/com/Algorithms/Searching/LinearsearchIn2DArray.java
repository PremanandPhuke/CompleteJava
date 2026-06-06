package com.Algorithms.Searching;

import java.util.Arrays;

public class LinearsearchIn2DArray {

    public static void main(String[] args) {
        int [][] arr= {
                {1, 2, 4},
                {23, 32, 34},
                {56, 65, 78},
        };

        int target= 32;

        int [] result = linearSearch( arr, target);

        System.out.println(Arrays.toString(result));
    }

    static int[] linearSearch(int [][] arr, int target){

        int [] list = new int [2];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==target){
                    list[0]=i;
                    list [1]=j;
                    return list;
                }
            }
        }

        return list;

    }
}
