package com.java.OOPs.Polymorphism;

public class RunTime {
    public static void main(String[] args) {

//        System.out.println("Here we have Animal class as a parent class, which is extended by Dog and Cat \nand in all these classes we have method bark() \nand this method gets override by both the child class methods \nlike mentioned in a code we have created objects in which we ");

        System.out.println("RUntile polymorphism is achieved through method overriding where a subclass provides specific implementation of a method already defined in parent class. \nThe method to be called is determined at Run Time based on the object");
        Animal dog= new Dog();
        Animal cat= new Cat();

        dog.bark();
        cat.bark();
    }
}

class Animal{

    void bark(){
        System.out.println("This animal barks ");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("This Dog barks ");
    }
}

class Cat extends Animal{
    void bark(){
        System.out.println("This Cat both bites and barks ");

    }
}
