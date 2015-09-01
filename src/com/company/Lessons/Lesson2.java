package com.company.Lessons;

/**
 * Created by natas on 24.08.2015.
 */
public class Lesson2 {

    public static void Start() {

        Person Vader = new Person();

        Vader.PrintName();
        Vader.FeedMe(5.526);

        Person Masha = new Person("Masha", 22, 50.5);

        Masha.PrintName();

        System.out.println("Weight of the " + Masha.GetWeight());

        if (Vader.GetWeight()>Masha.GetWeight()){
            System.out.println("Vader is fatter than Mary");
        }
        else {
            System.out.println("Mary is fatter than Vader");
        }

        Masha.FeedMe(60.5);

        if (Vader.GetWeight()>Masha.GetWeight()){
            System.out.println("Vader is fatter than Mary");
        }
        else {
            System.out.println("Mary is fatter than Vader");
        }

        Person Serega = new Person("Serega", 22, 75.6);
        Serega.FeedMe(Masha);
        Serega.FeedMe(2);


    }
}
