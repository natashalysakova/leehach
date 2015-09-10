package com.company.Practice;

/**
 * Created by natas on 08.09.2015.
 */
public class First {

    public void BeerSong(){

        int beerNum = 99;
        String word = "бутылок (булытки)";

        while (beerNum > 0){

            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum - 1;
            if (beerNum > 0){
                if (beerNum == 1){
                    word = "бутылка";// В единственом числе - ОДНА бутылка.
                }
                System.out.println(beerNum + " " + word + " пива на стене");
            }else{
                System.out.println("Нет бутылок пива на стене");
            }
        }
    }

    public static void PhraseGenerator(){

        String[] wordListOne = {"круглосуточный", "трех-звенный",
                "30000-футовьй", "взаимный", "обовдный выигрыш", "фронтэнд",
                "на основе веб-технологий", "проникащий", "умный", "шесть сигм", " метод критического пути", " динамичный"};
        String[]wordListTwo = {"уполномоченный", "трудный",
                "чистый продукт", "ориентированный", "центральный",
                "распределенный", "кластеризованный", "фирменный",
                "нестандартный ум", "позиционированный", "сетевой",
                "сфокусированный", "использованный с выгодой", "выровненный",
                "нацеленный на", "общий", "совместный", "ускоренный"};
        String[] wordListThree = {"процесс", "пункт разгрузки",
                "выход из положения", "тип структуры", "талант", "подход",
                "уровень завоеванного внимания", "портал", "период времени",
                "обзор", "образец", "пункт следования"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int)(Math.random() * oneLength);
        int rand2 = (int)(Math.random() * twoLength);
        int rand3 = (int)(Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("Все, что нам нужно, - это " + phrase);
    }

    public static void Shuffler(){

        int x = 3;

        while (x > 0) {

            if (x > 2) {
                System.out.print("a");
            }

            x = x - 1;
            System.out.print("-");

            if (x == 2){
                System.out.print("b c");
            }

            if (x == 1){
                System.out.print("d");
                x = x - 1;
            }

        }
    }

    public static void Pool(){

        int x = 0;
        while (x < 4){

            x = x - 1;

            if (x < 1){

                System.out.print("a ");
            }



            if (x > 0){

                System.out.print("an");
                x = x + 1;
            }
            if (x == 1){

                System.out.print("annoys");
            }
            if (x > 1){

            }
            System.out.println("");

            x = x + 2;
        }
    }


}
