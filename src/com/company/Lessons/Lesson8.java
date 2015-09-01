package com.company.Lessons;

import com.company.Lessons.Marvel.*;

/**
 * Created by natas on 26.08.2015.
 */
public class Lesson8 {


    public static void Start() {

        Hulk hulk = new Hulk(42, Sex.Male, "Bruce Banner");
        IronMan IM = new IronMan(41, Sex.Male, "Tony Stark");

        hulk.Fight(IM);
        /*for (int i = 0; i < 10000; i++) {
            hulk.Fight();
        }*/
        BlackWidow widow = new BlackWidow(30, Sex.Female, "Natasha Romanoff");

        widow.SedateHulk(hulk);

        widow.SetWeapon(Weapon.Mjolnir);

        Thor thor = new Thor(5200, Sex.Male, "Thor Odinson");

        thor.SetWeapon(Weapon.Bow);
        thor.SetWeapon(Weapon.Mjolnir);
    }

}
