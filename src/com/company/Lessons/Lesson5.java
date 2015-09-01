package com.company.Lessons;

import com.company.Lessons.Fauna.Cat;

import java.util.Scanner;

/**
 * Created by natas on 25.08.2015.
 */
public class Lesson5 {

    public static void AddEmptyLine(){
        System.out.println();
    }

    public static void Start(){
        System.out.println("Привет, это моя программа!");
        AddEmptyLine();
        System.out.print("Введите имя кота: ");

        String CatName;
        Scanner S = new Scanner(System.in);

        CatName = S.next();

        Cat cat = new Cat(CatName, 2);

        cat.PurPurPur();
        cat.Walk();


    }
}
