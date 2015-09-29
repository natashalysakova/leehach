package com.company.Practice;

/**
 * Created by natas on 16.09.2015.
 */
public class MyAnimal {

    static MyAnimal instance = null;

    public int x = 0;

    private MyAnimal(){
        x =3;
    }

    public static MyAnimal getInsatnce(){
        if(instance == null)
            instance = new MyAnimal();

        return instance;
    }



}
