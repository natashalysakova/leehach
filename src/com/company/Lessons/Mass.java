package com.company.Lessons;

/**
 * Created by quantark on 05.09.15.
 */
public class Mass {

    int[] Massive = {-3,5,7,-2,-8,9,19,-16,-4,13};

    int c = 7;
    int x = 0;

    int negative = 0;

    public void Counter (){

        for (int i = 0; i < Massive.length; i++) {

            if (Massive[i] > c) {

                x += 1;
            }

            if (Massive[i] < 0) {

                negative = i;
            }
        }

            int y = 0;

            for (int j = negative + 1; j < Massive.length; j++) {

                y += Massive[j];

            }

        System.out.println(x + "\n" + y);
    }
}
