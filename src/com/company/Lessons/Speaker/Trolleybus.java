package com.company.Lessons.Speaker;

/**
 * Created by quantark on 02.09.15.
 */
public class Trolleybus {

    String Go = "Trolley moved\n";
    String InDrive = "Trolley rides\n";
    String Stopped = "Trolley stopped\n";

    String FinalPhrase = Go +"\n" + InDrive + "\n" + Stopped;


    public String[] CurrentRoute;


    Radio radio = new Radio();

    public void Drive (){

        for (int j = 0; j < CurrentRoute.length ; j++) {

            System.out.println(FinalPhrase);
            radio.SayNextStop(CurrentRoute, j, false);
        }

        for (int i = CurrentRoute.length - 1; i >= 0; i--) {

            radio.SayNextStop(CurrentRoute, i, true);

            if (i != 0) {
                System.out.println(FinalPhrase);
            }
        }
    }

    public Trolleybus (String[] Route){

        CurrentRoute = Route;
    }

}
