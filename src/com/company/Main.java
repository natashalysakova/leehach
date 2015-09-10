package com.company;

import com.company.Comp.Motherboard;
import com.company.Lessons.*;
import com.company.Lessons.Book.Notebook;
import com.company.Lessons.Cards.Card;
import com.company.Lessons.Cards.Deck;
import com.company.Lessons.MyLittleKitchen.Count;
import com.company.Lessons.Speaker.Depo;
import com.company.Lessons.Speaker.Radio;
import com.company.Lessons.Speaker.Trolleybus;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {

        /*Trolleybus trolley = new Trolleybus(Depo.Route89);

        trolley.Drive();*/
/*
        try {

            Room room = new Room(3,6,6,0);

            room.Square();
            room.Volume();

            System.out.println(room.GetRoomState());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }*/

        /*Motherboard mom = new Motherboard(4096);
        mom.GetMotherboardState();*/

        /*List<String> list = new ArrayList<>();



        list.add("four");
        list.add("five");

        ArrayList<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");

        strings.add(0, "three");
        strings.remove(1);

        strings.addAll(list);

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }*/

        /*Massive mass = new Massive();
        mass.Function();*/

        /*Count count = new Count();
        count.CakesCounts();*/

        /*Mass M = new Mass();
        M.Counter();*/

        /*Deck deck = new Deck();

        Card c1 = deck.GetCard(14);

        System.out.println(c1);
        AddEmptyLine.Empty();

        Card[] c2 = deck.getDeckCards();
        Card[] c3 = deck.getSixCards();

        for (int i = 0; i < c2.length; i++) {

            System.out.println(c2[i]);
        }

        AddEmptyLine.Empty();

        for (int i = 0; i < c3.length; i++) {

            System.out.println(c3[i]);
        }*/

        /*int x = 0;

        Scanner S = new Scanner(System.in);
        x = S.nextInt();
        UserMass use = new UserMass(x);
        use.Func();*/

        int x = 0;

        while (x < 4){
            System.out.print("a");
            if(x < 1)
            {
                System.out.print(" ");
            }
            System.out.print("n");

            if(x > 1){
                System.out.print(" oyster");
                x+=2;
            }
            if(x == 1){
                System.out.print("noys");
            }
            if(x < 1){
                System.out.print("oise");
            }
            System.out.println();
            x+=1;
        }
    }
}
