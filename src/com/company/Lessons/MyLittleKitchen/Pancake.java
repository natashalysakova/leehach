package com.company.Lessons.MyLittleKitchen;

/**
 * Created by quantark on 04.09.15.
 */
public class Pancake {

    public double Rad;
    public String Color;

    public Pancake(double R, String C){

        Rad = R;
        Color = C;
    }

    public double GetSqr (){

        double Square;

        Square = Math.PI * Math.pow(Rad,2.0);

        return Square;
    }
}
