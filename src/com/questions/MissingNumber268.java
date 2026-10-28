package com.questions;

import java.util.Arrays;

public class MissingNumber268 {
    public static void main(String[] args){
        int[] arr=  {3, 1, 4, 5, 0};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }

    private static int missingNumber(int[] arr) {
        int n = arr.length;
        int i=0;

        while (i < n) {
            int cindex = arr[i];
            if (arr[i]<n && arr[i] != arr[cindex]) {
                int temp = arr[i];
                arr[i] = arr[cindex];
                arr[cindex] = temp;
            } else {
                i++;
            }
        }

        for(int index=0; index<n; index++){
            if(index != arr[index]){
                return index;
            }
        }

        return n;
    }
}
