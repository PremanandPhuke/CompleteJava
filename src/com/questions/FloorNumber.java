package com.questions;

public class FloorNumber {
    public static void main(String[] args) {

        //        Floor number means, the greatest element in the arrtay which is smaller than or equal to target;
        int [] arr= {2, 5, 9, 12, 14, 16, 19};
        int target=174;

        //        Floor number means, the greatest element in the arrtay which is smaller than or equal to target;

        System.out.println(FloorNum(arr, target));
    }

    static int FloorNum(int [] arr, int target){
        int start=0;
        int end= arr.length-1;
        int mid=0;

        while(start<= end){
            mid = start + (end-start)/2;

            if(arr[mid] < target){
                start= mid+1;
            } else if (arr[mid] > target) {
                end = end-1;
            }
            else {
                return arr[mid];
            }
        }

        return arr[end];
    }
}
