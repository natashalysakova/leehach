package com.company.Lessons.Speaker;

/**
 * Created by quantark on 01.09.15.
 */
public class Radio {


    private String Doors = "Attention, the doors are closing, ";

    private String NextStop = "the next stop is: ";


    public void SayNextStop(String[] route, int currentStopIndex, boolean isReverse) {


        System.out.println(route[currentStopIndex]);

        if (isReverse){

            if (currentStopIndex > 0) {

                System.out.print(Doors);
                System.out.print(NextStop);
                System.out.println(route[currentStopIndex - 1]);

            } else {
                System.out.println("The Way is End.");

            }

        }else
        {
            if (currentStopIndex < route.length - 1) {

                System.out.print(Doors);
                System.out.print(NextStop);
                System.out.println(route[currentStopIndex + 1]);

            } else {
                System.out.println("The Way is End.");

            }
        }




    }
}

