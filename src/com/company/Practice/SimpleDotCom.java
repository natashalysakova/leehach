package com.company.Practice;

/**
 * Created by quantark on 12.09.15.
 */
public class SimpleDotCom {

    int[] locationCells;
    int numOfHits = 0;

    public int[] getLocationCells(){
        return locationCells;
    }

    public int getNumOfHits(){
        return numOfHits;
    }
    public void setNumOfHits(int set){
        numOfHits = set;
    }

    public void setLocationCells(int[] loc){

        locationCells = loc;
    }

    public String CheckYourself(String stringGuess){

        int guess = Integer.parseInt(stringGuess);

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
/*
        String result = "Мимо";
        for(int cell : locationCells){

            if (userGuess == cell){

                result = "Попал";

                numOfHits++;

                break;
            }
        }*/

        return "Мимо";
    }
}
