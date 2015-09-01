package com.company.Lessons.Fauna;

/**
 * Created by natas on 24.08.2015.
 */
public abstract class Insect implements IWalk, IFly {
    @Override
    public void Fly() {
        System.out.println("Insect is flying");

    }

    @Override
    public void Walk() {
        System.out.println("Insect is walking");

    }
}
