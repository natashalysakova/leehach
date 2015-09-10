package com.company.Practice;

/**
 * Created by natas on 09.09.2015.
 */
public class Player {

    public int Guess(){
        int x = (int)(Math.random() * 10);
        System.out.println("Думаю, это число " + x);
        return x;
    }
}
