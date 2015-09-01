package com.company.Lessons.Marvel;

import java.util.Random;

/**
 * Created by natas on 26.08.2015.
 */
public class BlackWidow extends Avenger {

    public BlackWidow(int age, Sex gender, String alterEgo) {
        super("Black Widow", age, gender, Weapon.Pistols, alterEgo);
    }

    public void SedateHulk(Hulk hulk){

        if (hulk.State == HulkState.BigGreenMonster){

            Random R = new Random();

            do{
                int delta = R.nextInt(20);
                System.out.println(Marvel.ANSI_BlackWidow + Name + ": " + hulk.AlterEgo + ", please, sedate on " + delta + " points.");
                hulk.DownAnger(delta);

            }
            while (hulk.State == HulkState.BigGreenMonster);

        }
        else{
            System.out.println(Marvel.ANSI_BlackWidow + Name + ": " + hulk.AlterEgo + ", what do you doing tonight?");
        }
    }

    @Override
    public void Equip(Avenger enemy) {

    }
    @Override
    public void DeEquip() {

    }
}
