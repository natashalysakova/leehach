package com.company.Lessons;

/**
 * Created by natas on 24.08.2015.
 */
public class Person {

    public String Name;
    public int Age;
    private double weight;

    public Person(){

        Name = "Darth Vader";
        Age = 18;
        weight = 75.5;
    }

    public Person(String name, int age, double weight){

        Name = name;
        Age = age;
        this.weight = weight;
    }

    public double GetWeight(){
        return weight;
    }

    public void PrintName(){
        System.out.println("My name is " + Name);
    }

    public void FeedMe(double FoodWeight){
        weight = weight + 0.5 * FoodWeight;

        System.out.println(Name + " is not hungry anymore. Now his(her) weight is " + weight);
    }

    public void FeedMe(Person MyFood){
        weight = weight + 0.5 * MyFood.GetWeight();
        System.out.println(Name + " eats " + MyFood.Name);
    }
}
