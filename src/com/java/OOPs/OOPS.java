package com.java.OOPs;

public class OOPS {
    public static void main(String[] args) {

        System.out.println("=======================================");

        System.out.println("Q1. What is Class?");
        System.out.println("Class is blueprint for creating of objects. It defines the structure (fields) and behavior(methods) of objects");
        System.out.println("=======================================");
        System.out.println();

        System.out.println("Q2. What is Object?");
        System.out.println("Object is a real word entity of then created class");
        System.out.println("=======================================");
        System.out.println();


        System.out.println("For example, we have a class car in which we defined the its properties like Name, color and maxSpeed \n so, and we have 'Car' as a class which is same for all the types of car like \n every class has its name, color and maxSpeed \n and we have some objects means the real word entities or real behavior \n like a car class has object Swift which has its own name as Swift, own color as Spended Silver and own maxSpeed as 120 Km/hr ");
        System.out.println("=======================================");
        System.out.println("Lets take an example, look out to the code how we have created car class and created its object and printed details ");

//        for encapsulation in which we have made these parameters private and passed the required value which will not directly change the value
//        also this is the object when we have a constructor which take three parameters at the same time
        Car swift= new Car("Spended Silver", "Swift", 90);
        swift.Details();


//        this was for understanding class and objects
//        swift.name= "Swift";
//        swift.color= "Spended Silver";
//        swift.maxSpeed=120;

        // by creating this object we have override the constructor
        Car bmw= new Car("BMW", 90);
//        bmw.Details2();



    }
}
