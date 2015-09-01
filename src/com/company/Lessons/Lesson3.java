package com.company.Lessons;

import com.company.Lessons.Fauna.*;

/**
 * Created by natas on 24.08.2015.
 */
public class Lesson3 {

    public static void AddEmptyLine(){
        System.out.println();
    }

    public static void Start(){

        Cat Barsik = new Cat("Barsik", 34);
        Barsik.PurPurPur();

        Dog Jack = new Dog("Jack");
        Jack.Bark();

        AddEmptyLine();

        Barsik.Walk();
        Jack.Walk();

        Mouse Larisa = new Mouse("Larka");

        Larisa.Walk();

        AddEmptyLine();

        Animal[] MyAnimals = {Barsik, Jack, Larisa};

        for (int i = 0; i < MyAnimals.length; i++){
            MyAnimals[i].Walk();
        }

        Ant Murchik = new Ant();

        AddEmptyLine();

        Dog baton = new Dog("Baton");

        IWalk[] MyWalkers = {Barsik,Jack,Larisa,new Eagle(),new Ant(), Murchik, baton};

        for (int i = 0; i < MyWalkers.length; i++){
            MyWalkers[i].Walk();
        }


    }
}
