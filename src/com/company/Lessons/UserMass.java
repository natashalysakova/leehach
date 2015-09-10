package com.company.Lessons;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by quantark on 07.09.15.
 */
public class UserMass {

    public UserMass(int a){

        Random R = new Random(1);

        for (int i = 0; i < a ; i++) {

            ListMass.add(R.nextInt(20));
        }
    }

    ArrayList <Integer> ListMass = new ArrayList<>();

    int min = 20;
    int max = 0;
    int sum = 0;

    public void Func (){

        for (int i = 0; i < ListMass.size(); i++){

            if (ListMass.get(i) > max){
                max = ListMass.get(i);
            }

            if (ListMass.get(i) < min){
                min = ListMass.get(i);
            }

            System.out.print(ListMass.get(i) + " ");
        }
        AddEmptyLine.Empty();

        sum = min + max;

        System.out.println(min + "\n" + max + "\n" + sum);
    }
}
