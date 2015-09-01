package com.company.Lessons.Fauna;

/**
 * Created by natas on 24.08.2015.
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name, true, 0);
    }

    public void Bark(){
        System.out.println(Name + " Barking: \"Wow!!\"");
    }

    @Override
    public void Walk() {
        System.out.println("Dog " + Name + " limbing");
    }
}
