package com.java.OOPs.Inheritance;

public class Single {
    public static void main(String[] args) {

        // this is single level inheritance
        Dog tom= new Dog();
        tom.name= "TOM";

        tom.bark();

    }

}

class Animal{
    String name;
    void bark(){
        System.out.println("This animal "+name+" barks");
    }
}

class Dog extends Animal{

}
