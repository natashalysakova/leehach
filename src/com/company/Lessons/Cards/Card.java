package com.company.Lessons.Cards;

/**
 * Created by quantark on 05.09.15.
 */
public class Card {

    public int Number;

    public Card (int N){

        Number = N;

    }

    @Override
    public String toString() {
        return "Card Number is " + Number;
    }
}
