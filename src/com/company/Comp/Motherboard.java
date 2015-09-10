package com.company.Comp;

/**
 * Created by quantark on 03.09.15.
 */
public class Motherboard {

    Processor proc = new Processor("AMD", 2.4, 4, 399.99);

    public int RAM;

    public Motherboard (int r) throws Exception {

        RAM = r;

        if (r < 32){

            throw new Exception("RAM is not installed!");
        }
    }

    public String GetMotherboardState(){

        String G = "Данная материнская плата оснащена процессором марки " + proc.Mark + " с тактовой частотой " + proc.Frequency + "GHz и объёмом кэша " + proc.Cache + "Mb, который стоит " + proc.Value + "$." + "Также, в материнскую плату уже установлена оперативная память общим объёмом " + RAM + "Mb";

        System.out.println(G);
        return  G;
    }
}