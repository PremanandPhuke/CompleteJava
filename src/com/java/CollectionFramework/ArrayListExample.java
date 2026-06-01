package com.java.CollectionFramework;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        System.out.println("=================");

        System.out.println("Lets see an ArrayList: ");

        //syntax
        ArrayList<Integer> list= new ArrayList<>();

        System.out.println(
                "This is dynamic array which internlly uses array to store values but as soon as initail array gets fill more than half then it automatically create new one of double size and copy all elements to the new one"
        );

        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println(list);
        list.set(2, 10000);
        System.out.println(list);

        System.out.println(list.get(3));

        System.out.println(list.indexOf(70));


    }
}
