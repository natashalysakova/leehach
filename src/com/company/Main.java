package com.company;

import com.company.Lessons.*;
import com.company.Lessons.hatassska.TV.TV;
import com.company.Practice.*;

public class Main {


    public static void main(String[] args) {

        /*TV tv = new TV();
        System.out.println(tv.downCurrentChannel());
        System.out.println(tv.upVolume());

        System.out.println(tv.onOffTv());

        *//*for (int i = 0; i < 60; i++) {
            System.out.println(tv.downVolume());
            System.out.println(tv.downCurrentChannel());
        }*/

       /* GuessGame game = new GuessGame();
        game.StartGame();*/

        /*DrumKit d = new DrumKit();

        d.playSnare();
        d.playTopHat();*/
/*
        Echo e1 = new Echo();
        Echo e2 = e1;

        int x = 0;

        while (x < 4){
            e1.hello();
            e1.count++;
            if (x == 3){
                e2.count++;
            }
            if (x > 0){
                e2.count += e1.count;
            }
            x++;
        }
        System.out.println(e2.count);*/

/*
        String[] islands = new String[4];
        islands[0] = "Бермуды";
        islands[1] = "Фиджи";
        islands[2] = "Азорские острова";
        islands[3] = "Косумель";

        int[] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int y = 0;
        int ref;

        while (y < 4) {

            ref = index[y];

            *//*System.out.print("острова = ");*//*
            System.out.println(islands[ref]);
            y = y + 1;
        }*/

        Triangle ta = new Triangle();

        while (x < 4){
            Triangle[] t = new Triangle[4];
            ta.height = (x + 1) * 2;
            ta.length = x + 4;

            System.out.print("треугольник " + x + ", зона");
            System.out.println(" = " + .area);

        }

        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", зона t5 = " + t5.area);
    }
}



