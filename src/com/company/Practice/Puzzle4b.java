package com.company.Practice;

/**
 * Created by quantark on 11.09.15.
 */
public class Puzzle4b {
    public int ivar;

    public int doStuff(int factor)
    {
        if(ivar > 100)
        {
            return ivar * factor;
        }
        else {
            return ivar * (5 - factor);
        }
    }
}
