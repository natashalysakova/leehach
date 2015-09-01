package com.company.Lessons;

/**
 * Created by natas on 21.08.2015.
 */
public class Lesson1 {

    public static void result (double x, double y, double z){
        System.out.println("x = " + x + "\ny = " + y + "\nz = " + z);
    }

    public static void result (double x, double y){

        System.out.println("x = " + x + "\ny = " + y);
    }


    public static void ShowLessonResult(){
        double x = 9;
        double y = 3;
        double z;

        result(x, y);

        System.out.println("Make a summa");
        z = Calc.sum(x, y);
        result(x, y, z);

        System.out.println("Make a division");
        try {
            z = Calc.div(z,x);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        result(x, y, z);

        System.out.println("Make a multiplication");
        x = Calc.mult(y,z);
        result(x, y, z);

        System.out.println("Make a substraction");
        y = Calc.sub(z,x);
        result(x, y, z);

        System.out.println("Pi was here");


        try {
            double Pi = Calc.getPi("Please!");
            System.out.println("Pi = " + Pi);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
