package com.company.Lessons.Fauna;

/**
 * Created by natas on 24.08.2015.
 */
public abstract class Animal implements IWalk {

    public void Walk(){
        System.out.println(Name + " is walking");
    }

    public final int LegsCount = 4;
    public boolean isTail;
    public String Name;
    public int Age;

    public Animal(String name, boolean isTail, int age)
    {
        Name = name;
        this.isTail = isTail;
        Age = age;
    }
}
