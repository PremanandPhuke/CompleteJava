package com.java.Arrays;

public class Def {
    public static void main(String[] args) {
        System.out.println("=================");
        System.out.println(
                "An **array** in Java is a collection of elements of the **same data type** stored in **contiguous memory locations**. It is a **fixed-size data structure**, meaning the size of the array is defined at the time of its creation and cannot be changed later.\n" +
                        "\n" +
                        "Arrays are used to store multiple values in a single variable, unlike regular variables, which store a single value"
        );
        System.out.println("=================");

        System.out.println(
                "Syntax: \n     datatype[] name= new datatype[size]"
        );

        System.out.println("=================");

        System.out.println("=================");

        int [] arr= new int[5];


//        int arr; declaration : getting defined in the stack
//        new int [5] = initalization: actually here object is getting created in the memory(heap)
//        at this moment all the values in this array are 0 and if the arr type is String th default values will be NULL
        System.out.print("[");
        for(int val: arr){
            System.out.print(val+",");
        }
        System.out.println("]");

    }
}
