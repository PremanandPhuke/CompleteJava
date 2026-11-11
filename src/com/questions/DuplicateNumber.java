package com.questions;

//287. Find the Duplicate Number

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums= {1 , 3, 2, 4, 4};
        int ans= findDuplicate(nums);
        System.out.println(ans);
    }

    private static int findDuplicate(int[] nums) {
        int n=nums.length;
        int i=0;

        while(i<n){
            int c= nums[i]-1;

            if( nums[i] != nums[c]){
                int temp= nums[i];
                nums[i]= nums[c];
                nums[c]= temp;
            }else{
                i++;
            }
        }

        for(int index=0; index<n; index++){
            System.out.println(nums[index]);
        }

        System.out.println("===========");
        for(int index=0; index<n; index++){
            if(index+1 != nums[index]){
                return nums[index];
            }
        }

        return i;
    }
}
