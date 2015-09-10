package com.company.Comp;


/**
 * Created by quantark on 03.09.15.
 */
public class Processor {

    public String Mark;
    public double Frequency;
    public int Cache;
    public double Value;

    public Processor (String M, double F, int C, double V) throws Exception {

        Mark = M;
        Frequency = F;
        Cache = C;
        Value = V;

        if (Mark == null || Mark.equals("") || Frequency == 0 || Cache == 0 || Value == 0){

            throw new Exception("Ты шо, дурак?");
        }
    }




}
