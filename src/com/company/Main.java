package com.company;

import com.company.Practice.*;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int numOfGuesses = 0;

        SimpleDotCom theDotCom = new SimpleDotCom();

        int randomNum = (int)(Math.random() * 5);
        int[] locations = new int [3];

        locations[0] = randomNum;

        for (int i = 1; i < locations.length; i++) {

            locations[i] = locations[i - 1] + 1;
        }

        theDotCom.setLocationCells(locations);

            boolean isAlive = true;

            int arrayLength = theDotCom.getLocationCells().length;

            while (isAlive){

                System.out.println("Введите число: ");
                String s = new Scanner(System.in).next();

                System.out.println(theDotCom.CheckYourself(s));

                numOfGuesses++;

                if (theDotCom.getNumOfHits() == arrayLength){

                    isAlive = false;

                    System.out.println("Вам потребовалось " + numOfGuesses + " попытки(-ок)");
                }
            }
        }
    }



