package com.company.Lessons.Garage;

/**
 * Created by natas on 25.08.2015.
 */
public class Car {

    public static String Caption = "This is Car Class";

    public String Name;
    public int CurrentSpeed;

    public static final int MaxSpeed = 170;

    public void PrintState(){
        System.out.println(Name + " is going " + CurrentSpeed + "km/h.");
    }

    public void SpeedUp(int a){
        CurrentSpeed += a;
        if (CurrentSpeed > MaxSpeed){
            CurrentSpeed = MaxSpeed;
        }
    }

    public void SpeedDown(int b){
        CurrentSpeed -= b;
        if (CurrentSpeed < 0){
            CurrentSpeed = 0;
        }
    }

    public Car(){
        Name = "Default Car";
        CurrentSpeed = 0;
    }

    public Car (String a){
        Name = a;
        CurrentSpeed = 0;
    }

    public Car (String a, int b){
        Name = a;
        CurrentSpeed = b;
    }
}
