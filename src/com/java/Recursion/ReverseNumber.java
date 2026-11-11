package com.java.Recursion;

public class ReverseNumber {

    public static void main(String[] args) {
        int n =1342;

        System.out.println(reverseNumber(n));
    }

    private static int reverseNumber(int n) {

        if(n<1){
            return 0;
        }
        return (n%10)*10 + reverseNumber(n/10);
    }
}r
