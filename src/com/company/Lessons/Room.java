package com.company.Lessons;

/**
 * Created by quantark on 03.09.15.
 */
public class Room {

    public double Height;
    public double Width;
    public double Deep;
    public int Windows;
    private double Square;
    private double Volume;


    public double Square (){

        Square = this.Width * this.Deep;
        return Square;
    }

    public double Volume (){

        Volume = this.Height * this.Width * this.Deep;
        return Volume;
    }

    public int GetWinCount(){

        return Windows;
    }

    public String GetRoomState(){

        String S = "Это просторная комната с " + Windows + "-мя окнами, площадью в " + Square + " квдратных метра и объёмом в " + Volume + " метра кубических.";

        return  S;
    }


    public Room (int H, int W, int D, int Win) throws Exception {

        Height = H;
        Width = W;
        Deep = D;
        Windows = Win;

        if (Height == 0 || Width == 0 || Deep == 0 || Windows == 0){

            throw new Exception("Ты шо, дурак?");
        }

    }
}