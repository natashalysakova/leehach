package com.company.Practice;

/**
 * Created by natas on 09.09.2015.
 */
public class GuessGame {

    Player p1;
    Player p2;
    Player p3;

    public void StartGame(){

        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int)(Math.random() * 10);
        System.out.println("Я загадываю число от 0 до 9");

        while (true){

            System.out.println("Число, которое нужно угадать, - " + targetNumber);

            guessp1 = p1.Guess();
            guessp2 = p2.Guess();
            guessp3 = p3.Guess();

            System.out.println("Первый игрок думает, что это " + guessp1);
            System.out.println("Второй игрок думает, что это " + guessp2);
            System.out.println("Третий игрок думает, что это " + guessp3);

            if (guessp1 == targetNumber){
                p1isRight = true;
            }
            if (guessp2 == targetNumber){
                p2isRight = true;
            }
            if (guessp3 == targetNumber){
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight){

                System.out.println("У нас есть победитель!");

                if (p1isRight)
                {
                    System.out.println("Первый игрок угадал назвав" + guessp1);
                }
                else {
                    System.out.println("Первый игрок не угадал. Он назвал " + guessp1);
                }

                if (p2isRight)
                {
                    System.out.println("Второй игрок угадал назвав" + guessp2);
                }
                else {
                    System.out.println("Второй игрок не угадал. Он назвал " + guessp2);
                }

                if (p3isRight)
                {
                    System.out.println("Третий игрок угадал назвав" + guessp3);
                }
                else {
                    System.out.println("Третий игрок не угадал. Он назвал " + guessp3);
                }

                System.out.println("Конец игры");
                break;
            }else {
                System.out.println("Игроки должны попробовать еще раз.");
            }
        }
    }
}
