package com.java.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n= 51223;

        System.out.println(digitSum(n));
    }

    public static int digitSum(int n){

        if( n < 1){
            return 0;
        }

        return (n % 10) + digitSum(n/10);
    }
}
