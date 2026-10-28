package com.questions;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {
    public static void main(String[] args) {
        int[] nums=  {4,3,2,7,8,2,3,1};
        List<Integer> list = findDisappearedNumbers(nums);
        System.out.println(list);
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {

        int i=0;
        int n= nums.length;
        while(i<n){
            int cIndex= nums[i]-1;
            if(nums[i] != nums[cIndex]){
                int temp= nums[i];
                nums[i]= nums[cIndex];
                nums[cIndex]= temp;
            } else{
                i++;
            }
        }

        List<Integer> list= new ArrayList<Integer>();

        for(int index=0; index<n; index++){
            if(index+1 != nums[index]){
                list.add(index+1);
            }
        }
        return list;
    }
}
