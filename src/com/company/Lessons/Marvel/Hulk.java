package com.company.Lessons.Marvel;

import java.awt.*;

/**
 * Created by natas on 26.08.2015.
 */
public class Hulk extends Avenger {

    public HulkState State;
    private int Anger;
    private final int MaxAnger = 200;
    private final int KickDown = 100;

    public Hulk(int age, Sex gender, String alterEgo) {
        super("Hulk", age, gender, Weapon.Unarmed, alterEgo);

        State = HulkState.Scientist;
        Anger = 15;
    }

    protected void UpAnger(int Delta){
        Marvel.AddEmptyLine();

        Anger += Delta;
        if(Anger > KickDown && State == HulkState.Scientist){
            State = HulkState.BigGreenMonster;
            Health = 200;
            System.out.println(Marvel.ANSI_Hulk + Name + ": Hulk smash!!!" + Marvel.ANSI_RESET);
            System.out.println("Hulk is Ready to SMASH!!!");
            Marvel.AddEmptyLine();
        }
        if (Anger > MaxAnger){
            Anger = MaxAnger;
        }
    }

    protected void DownAnger(int Delta){
        Marvel.AddEmptyLine();

        Anger -= Delta;
        if(Anger < KickDown && State == HulkState.BigGreenMonster){
            State = HulkState.Scientist;
            Health = 100;
            isAlive = true;
            System.out.println(Marvel.ANSI_Hulk + AlterEgo + ": How many people I Killed?" + Marvel.ANSI_RESET);
            System.out.println(Marvel.ANSI_NickFury + Marvel.ANSI_WHITE + "Nick Fury: " + Marvel.ANSI_RESET + "Not much, just a " + KillsCount + " people...");

        }
        if (Anger < 0){
            Anger = 0;
        }
    }

    @Override
    public void Fight(){

        UpAnger(MaxAnger);
        super.Fight();

        if(!isAlive) {
            DownAnger(MaxAnger);
        }
    }


    @Override
    public void Equip(Avenger enemy) {

        UpAnger(MaxAnger);
    }

    @Override
    public void DeEquip() {

        if(!isAlive){
            DownAnger(MaxAnger);
        }
    }
}
