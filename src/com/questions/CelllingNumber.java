package com.questions;

public class CelllingNumber {
    public static void main(String[] args) {

//        Celling number means, the smallest element in the arrtay which is greater than or equal to target;
        int [] arr= {2, 5, 9, 12, 14, 16, 19};
        int target=1;

//        here celling number is 16, its smallest element in the array whihc is greater than or equal to target

        System.out.println(CellingNum(arr, target));
    }

    static int CellingNum(int []arr, int target){
        int start=0;
        int end= arr.length-1;
        int mid=0;

        while (start <= end){
             mid = start + (end -start)/2;

            if(arr[mid] < target){
                start = mid +1;
            }
            else if(arr[mid]>target){
                end = mid -1;
            }
            else{
                return arr[mid];
            }
        }

        return arr[start] ;
    }
}
