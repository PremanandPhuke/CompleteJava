package com.java.Recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        
        int num= 20;
        
        int ans= fib(num);

        System.out.println(ans);
    }
    
    static int fib(int n){

        if(n==1 || n==0) return n;
        
        return fib(n-2) + fib(n-1);
    }
}
