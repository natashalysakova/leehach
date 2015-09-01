package com.company.Lessons.Marvel;

import com.company.Lessons.Fauna.IFly;

/**
 * Created by natas on 26.08.2015.
 */
public class Thor extends Avenger implements IFly{

    public Thor(int age, Sex gender, String alterEgo) {
        super("Thor", age, gender, Weapon.Mjolnir, alterEgo);

        Health = 175;
    }


    @Override
    public void Equip(Avenger enemy) {
    }

    @Override
    public void DeEquip() {
    }

    @Override
    public void Fly() {

        if (EquippedWeapon != Weapon.Mjolnir){
            return;
        }

    }


}
