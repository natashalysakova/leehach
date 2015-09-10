package com.company.Lessons.MyLittleKitchen;

import java.util.Random;

/**
 * Created by quantark on 04.09.15.
 */
public class Count {

    Pancake[] cakes = new Pancake[100];

    public void CakesCounts(){

        double CakeR;
        double x = 0.0;

        Random R = new Random();

        for (int i = 0; i < cakes.length; i++) {

            CakeR = R.nextDouble() * 25;
            Pancake Cake = new Pancake(CakeR, "White");

            cakes[i] = Cake;

            x += cakes[i].GetSqr();
        }



        System.out.println(x);
    }
}
