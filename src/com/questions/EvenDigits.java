package com.questions;

//1295. Find Numbers with Even Number of Digits
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/


public class EvenDigits {
    public static void main(String[] args) {

        int [] arr= {12,345,2,6,7896};

        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int [] arr){

        int count=0;

        for(int val: arr){

            int digit = digits(val);

            if(digit % 2==0){
                count++;
            }
        }

        return count;
    }


    static int digits(int val){
        int count=0;
        if(val < 0){
            val= val * -1;
        }

        if(val ==0){
            return 1;
        }

        while( val > 0){

            if(val % 10 >=0){
                count++;
            }
            val = val / 10;
        }

        return count;
    }
}
