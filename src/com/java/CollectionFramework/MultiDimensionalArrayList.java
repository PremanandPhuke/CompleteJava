package com.java.CollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {

    public static void main(String[] args) {

        System.out.println("=================");

        System.out.println("Lets see multi dimensional arraylist: ");

        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        Scanner sc= new Scanner(System.in);

        System.out.println(list);

//        initalisation
        for(int i=0; i<4; i++){
            ArrayList<Integer> row= new ArrayList<>();

            for(int j=0; j<5; j++){
                row.add(sc.nextInt());
            }

            list.add(row);
        }

        System.out.println(list);

        System.out.println(list.get(3));



    }
}
