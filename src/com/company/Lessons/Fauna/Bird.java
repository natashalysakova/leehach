package com.company.Lessons.Fauna;

/**
 * Created by natas on 24.08.2015.
 */
public abstract class Bird implements IWalk, IFly{


    public void Walk() {
        System.out.println("Bird is walking");
    }

    @Override
    public void Fly() {
        System.out.println("Bird is flying");
    }
}
