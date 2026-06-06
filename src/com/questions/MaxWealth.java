package com.questions;

//1672. Richest Customer Wealth
//https://leetcode.com/problems/richest-customer-wealth/description/

public class MaxWealth {
    public static void main(String[] args) {
        int [][] acounts = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };

        System.out.println(maximumWealth(acounts));
    }

    static int maximumWealth(int [][] accounts){
        int max=0;

        for(int i=0; i< accounts.length; i++){

            int temp=0;

            for(int j=0; j< accounts[0].length; j++){
                temp = temp + accounts[i][j];
            }

            if(temp > max){
                max = temp;
            }
        }

        return max;
    }
}
