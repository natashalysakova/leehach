package com.company.Lessons;

import java.util.Random;

/**
 * Created by quantark on 04.09.15.
 */
public class Massive {

    int[] SomeNumbers = new int[20];

    Random R = new Random();

    public void Function() {

        for (int i = 0; i < SomeNumbers.length; i++) {

            SomeNumbers[i] = R.nextInt(10);
        }
        int x = 0;
        int sum = 0;
        double min = SomeNumbers[0];
        /*double max = SomeNumbers[0];*/

        for (int i = 0; i < SomeNumbers.length; i++) {

            /*if (SomeNumbers[i] > max) {

                max = SomeNumbers[i];
            }
*/

            if (SomeNumbers[i] < min) {

                min = SomeNumbers[i];
                x = i;
            }
        }

            for (int j = x + 1; j < SomeNumbers.length; j++) {

                sum += SomeNumbers[j];
                }

                System.out.println(x + "\n" + sum);
        }

        /*double sum = min + max;*/

    }
