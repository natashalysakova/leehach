package com.company.Practice;

import java.util.ArrayList;

/**
 * Created by quantark on 12.09.15.
 */
public class DotCom {

    public DotCom(String name) {
        this.name = name;
    }

    String name;

    private ArrayList<String> locationCells;

    public ArrayList<String> getLocationCells(){
        return  locationCells;
    }
    //private int numOfHits = 0;

    //public int[] getLocationCells(){
    //    return locationCells;
    //}
    //public int getNumOfHits(){
    //   return numOfHits;
    //}
    //public void setNumOfHits(int set){
    //    numOfHits = set;
    //}

    public void setLocationCells(ArrayList<String> loc){

        locationCells = loc;
    }

    public String checkYourself(String userInput){

        String result = "Мимо";

        int index = locationCells.indexOf(userInput);

        if (index >= 0) {

            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "Потопил";
                System.out.println("Ой! Вы потопили " + name + " : ( ");
            } else {
                result = "Попал";
            }
        }
        return result;


        /*for(int cell : locationCells){

            if (userGuess == cell){

                result = "Попал";

                numOfHits++;

                break;
            }
        }*/

        /*int guess = Integer.parseInt(stringGuess);

        for (int i = 0; i < locationCells.length; i++) {

            if (guess == locationCells[i]){

                numOfHits += 1;

                if (numOfHits == locationCells.length){

                    return "Потопил";

                } else {
                    return "Попал";
                }
            }
        }

        return "Мимо";*/
    }
}
