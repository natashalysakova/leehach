package com.company.Lessons.Cards;

import java.util.Random;

/**
 * Created by quantark on 05.09.15.
 */

//        Описать класс «колода карт», включающий закрытый массив элементов класса
//        «карта». В карте хранятся масть и номер. Обеспечить возможность вывода кар
//        ты по номеру, вывода всех карт и выдачи по 6 штук в случайном порядке.
//        Написать программу, демонстрирующую все разработанные элементы классов.

public class Deck {

    private Card[] DeckCards = new Card[36];

    public Deck() {

        for (int i = 0; i < DeckCards.length; i++) {

           /* Card card = new Card(i);
            DeckCards[i] = card;
            */
            DeckCards[i] = new Card(i);
        }
    }

    public Card GetCard(int i) {

        return DeckCards[i];
    }

    public Card[] getDeckCards() {

        return DeckCards;

    }

    public Card[] getSixCards() {

        Card[] SixCards = new Card[6];
        Random R = new Random();

        for (int i = 0; i < SixCards.length; i++) {

            int x = 0;

            x = R.nextInt(35);

            SixCards[i] = GetCard(x);
        }

        return SixCards;
    }
}