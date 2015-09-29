package com.company.Practice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by natas on 15.09.2015.
 */
public class DotComBust {

    private GameHelper helper = new GameHelper();
    ArrayList<DotCom> dotComList = new ArrayList<>();
    int numOfGuesses = 0;

    public void setUpGame(){

        dotComList.add(new DotCom("Pets.com"));
        dotComList.add(new DotCom("eToys.com"));
        dotComList.add(new DotCom("Go2.com"));

        System.out.println("Ваша цель - потопить три \"сайта\"");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");

        for (DotCom dotComToSet : dotComList){

            ArrayList<String> newLocation = helper.placeDotCom(3);

            dotComToSet.setLocationCells(newLocation);
        }
    }

    public void startPlaying(){

        while (!dotComList.isEmpty()){

            System.out.println("Сделайте ход:");
            String userGuess = new Scanner(System.in).next();

            checkUserGuess(userGuess);
        }
        finishGame();
    }

    public void checkUserGuess(String userGuess){

        numOfGuesses++;
        String result = "Мимо";

        for (DotCom dotComToTest : dotComList){

            result = dotComToTest.checkYourself(userGuess);

            if (result.equals("Попал")){
                break;
            }
            if (result.equals("Потопил")){
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);

    }

    public void finishGame(){

        System.out.println("Все \"сайты\" ушли ко дну! Ваши акции теперь ничего не стоят.");

        if (numOfGuesses < 18){
            System.out.println("Это заняло у вас всего" + numOfGuesses + "попыток.");
            System.out.println("Вы успели выбраться до того, как ваши вложения утонули.");
        } else {
            System.out.println("Это заняло у вас довольно много времени. " + numOfGuesses + "попыток.");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений.");
        }
    }
}
