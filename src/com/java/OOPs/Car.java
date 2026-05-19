package com.java.OOPs;

public class Car {

    private String name;
    private String color;
    private int maxSpeed;

    // constructor is a method, used to initialize new objects
    public Car(String color, String name, int maxSpeed){

//        this used like, set the color value we got from this constructor calling to the color variable which is declared outside this constructor in this file
        this.color= color;
        this.name= name;

        if(maxSpeed>100){
            this.maxSpeed= maxSpeed;
            System.out.println(maxSpeed+" Do not overspeed!");
        }
        else {
            System.out.println("Why you are so slow");
        }
    }

    // Here we have created multiple constrictor with same name which called as constrictor overloading
    public Car(String name, int maxSpeed){
        this.name= name;
        this.maxSpeed= maxSpeed;
        System.out.println("This is "+name+" and its maxSpeed is "+maxSpeed);

        if(maxSpeed>150){
            System.out.println("That's really impressive!");
        }else if(maxSpeed > 100) {
            System.out.println("Nice going but if it going above 150 then it will be impressive");
        }
        else{
            System.out.println("That's toooooooooooooo Badddddddd 🫠😵‍💫🥴");
        }
    }

    public Car(int maxSpeed){
        this.maxSpeed= maxSpeed;
    }


    void Details(){
        System.out.println("This is "+name+" of color "+color+" its maxSpeed is "+maxSpeed);
    }

//    void Details2(){
//        System.out.println("This is "+name+"and its maxSpeed is "+maxSpeed);
//    }

}
