package com.company.Lessons;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by natas on 25.08.2015.
 */
public class Lesson4 {

    public static void Start() {

/*        int[] Integer = {85,74,23,69,37};
        for (int i = 0; i < 5 ; i++) {
            System.out.println(Integer[i]);
        }*/

        int[] Million = new int[10];
        Random R = new Random();

        for (int i = 0; i < Million.length; i++) {


            if( i == 4) {
                continue;
            }

            System.out.print(i + ". ");
            Million[i] = R.nextInt(10);
            System.out.print(Million[i] + " ---> ");
            Million[i] = (int)Math.pow(Million[i], 2.0);
            System.out.println(Million[i]);

            if(i == 6){
                break;
            }

            if( i == 3)
            {
                return;
            }
        }

        //цикл foreach
        for (int x : Million){
            x = R.nextInt(5);
            System.out.println(x);
        }






    }
}
