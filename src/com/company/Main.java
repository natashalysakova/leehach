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
        System.out.println(e2.count);
        }
    }



