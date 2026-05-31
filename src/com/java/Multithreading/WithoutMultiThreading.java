package com.java.Multithreading;

public class WithoutMultiThreading {
    public static void main(String[] args) {

        long startTime= System.currentTimeMillis();

        int sum=0;
        for(int i=0; i<1000; i++){
            sum= sum+ i;
        }
        System.out.println(sum);


        int count=0;
        for(int i=0; i<1000; i++){
            if(i % 10==7){
                count++;
            }
        }

        System.out.println("Numbers end with 7 from 0 to 1000 are: "+ count);

        System.out.println("And Time taken to run this program is: "+ (System.currentTimeMillis()-startTime)+"ms");
    }
}
