package com.Algorithms.Searching;

import java.util.Arrays;

public class BinarySearchIn2D {

    public static void main(String[] args) {

        // This is row wise and col wise sorted matrix
        int [][]arr= {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        // This is complete sorted matrix


        int target= 29;

        System.out.println(Arrays.toString(BS2D(arr, target)));

    }

    static int[] BS2D(int [][] arr, int target){

        int r= arr.length;
        int c= arr[0].length;
        int []ans= {-1, -1};

        int i=0, j= c-1;

        while(i<r && j>=0){

            if(arr[i][j]==target){
                ans[0]=i;
                ans[1]=j;

                return ans;
            }
            else if(arr[i][j]<target){
                i++;
            }
            else{
                j--;
            }
        }

        return ans;

    }

}
