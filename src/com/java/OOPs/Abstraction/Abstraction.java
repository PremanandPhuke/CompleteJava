package com.java.OOPs.Abstraction;

public class Abstraction {
    public static void main(String[] args) {
        System.out.println("====================");
        System.out.println("abstraction focuses on showing only issential details while hiding the implementation. It is achieved through abstract classes and Interfaces");
        System.out.println("====================");

        Dog dog= new Dog();
        Cat cat = new Cat();

        dog.sayHello();
        cat.sayHello();
        dog.sleep();

    }
}

abstract class Animal{
     abstract void sayHello();
     abstract void sayByee();

     void sleep(){
         System.out.println("zz...");
     }
}

class Dog extends Animal{

    @Override
    void sayHello(){
        System.out.println("dog hello");
    }

    @Override
    void sayByee(){
        System.out.println("dog bye");
    }
}

class Cat extends Animal{


    @Override
    void sayHello(){
        System.out.println("cat hello");
    }

    @Override
    void sayByee(){
        System.out.println("cat bye");
    }
}
