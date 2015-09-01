package com.company.Lessons;

/**
 * Created by natas on 21.08.2015.
 */
public class Calc {

    public static String captionCalc = "dumb Calc";
    private static final double Pi = 3.14;
    private static final String KeyWord = "Please!";

    public static double getPi(String whatusersay)throws Exception {
        if (whatusersay == KeyWord){
            return Pi;
        }
        else {
            throw new Exception("You shall not pass!");
        }

    }


    public static double sum (double a, double b){
        return a + b;
    }
    public static double sub (double a, double b){
        return a - b;
    }
    public static double mult (double a, double b){
        return a * b;
    }
    public static double div (double a, double b) throws Exception {
        if (b == 0){
            throw new Exception("You can not divide by zero, DUMB!!!");
        }
        if (b == 1){
            throw new Exception("LOL");
        }
        return a / b;
    }
}
