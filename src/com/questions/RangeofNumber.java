package com.questions;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/


public class RangeofNumber {

    public static void main(String[] args) {

        int [] arr= {5,7,7,8,8,10};
        int target= 8;

        System.out.println(Arrays.toString(searchRange(arr, target)));

    }
//    int[] arr, int target, boolean firstIndex
    static int[] searchRange(int[] arr, int target){

        int [] ans= {-1, -1};

        int start= search(arr, target, true );
        int end= search(arr, target, false);

        ans[0]= start;
        ans[1]= end;


        return ans;
    }

    static int search(int[] arr, int target, boolean firstIndex){

        int ans=-1;
        int start=0;
        int end= arr.length-1;

        while(start<=end){

            int mid= start + (end-start)/2;

            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target>arr[mid]){
                start= mid+1;
            }
            else{

                ans= mid;

                if(firstIndex){
                    end= mid-1;
                }
                else{
                    start= mid+1;
                }
            }
        }

        return ans;
    }
}
