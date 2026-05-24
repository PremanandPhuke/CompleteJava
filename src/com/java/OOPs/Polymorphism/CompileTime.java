package com.java.OOPs.Polymorphism;

public class CompileTime {
    public static void main(String[] args) {

//        System.out.println("Here we have calculator class which have multiple methods with same name, \nso how can a object created in main method will decide which method to call\n" +
//                "The answer is it will decide at complie time means it will decide on what argument is passed which will be decided at compile time \n");
        System.out.println("===========================");
        System.out.println("Compile time polymorphism is achieved by Method Overloading, \nmethod overloading in java is a feature which allows a class to have multiple methods with same name but different parameters list \nIt enable method to perform different tasks depending on the arguments passed in it.");
        System.out.println("===========================");

        Calculator test= new Calculator();

        test.add(2);
        test.add("Prem");
    }
}


// Here we have calculator class which have multiple methods with same name, so how can a object created in main method will decide which method to call
//The answer is it will decide at complie time means it will decide which method to call will decide on what argument is passed which will be decided at compile time
class Calculator{
    void add(int a){
        System.out.println("This is int "+a);
    }

    void add(String s){
        System.out.println("This is string "+s);
    }

    void add(int b, int c){
        System.out.println("This contains two integers ");
    }

    void add(String s1, String s2){
        System.out.println("This contains two strings");
    }

    void add(int d, String s3){
        System.out.println("This contains int, string respectively");
    }

    void add(String s4 ,int e){
        System.out.println("This contains String, Int respectively");
    }
}
