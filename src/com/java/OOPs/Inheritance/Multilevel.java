package com.java.OOPs.Inheritance;

public class Multilevel {
    public static void main(String[] args) {

        // this is multi level inheritance
        Swift swift = new Swift();

        swift.name= "SWIFT zxi+";
        swift.name2= "SWIFT zxi";

        swift.bmw();
        swift.kia();

    }
}


class Bmw{
    String name;
    void bmw(){
        System.out.println("This is "+name);
    }
}

class Kia extends Bmw{
    String name2;
    void kia(){
        System.out.println("This is "+name2);
    }
}

class Swift extends Kia{

}