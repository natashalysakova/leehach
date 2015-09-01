package com.company.Lessons;

/**
 * Created by natas on 21.08.2015.
 */
public class BDay {

    public static String Congratulations = "Happy Birthday, ";

    public static void Start(){

        String name1 = "Natalya";
        String name2 = "Mariya";
        String name3 = "Vladimir";

        abc(name1);
        abc(name2);
        abc(name3);
    }
    public static void abc(String name){

        System.out.println(Congratulations + name);
    }

}
