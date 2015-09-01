package com.company.Lessons.Marvel;

import com.company.Lessons.Fauna.IFly;

/**
 * Created by natas on 26.08.2015.
 */
public class IronMan extends Avenger implements IFly {

    private final int MaxArmorPoints = 150;
    private final int MaxVeronicaPoints = 200;

    public IronMan(int age, Sex gender, String alterEgo) {
        super("Iron Man", age, gender, Weapon.Energy, alterEgo);

        Health = MaxArmorPoints;

    }

    private void UseVeronica(){
        Marvel.AddEmptyLine();

        EquippedWeapon = Weapon.Veronica;
        Health = MaxVeronicaPoints;
        System.out.println(Name + " equipped Veronica");
        Marvel.AddEmptyLine();
    }

    private void UseMark(){
        Marvel.AddEmptyLine();

        EquippedWeapon = Weapon.Energy;
        Health = MaxArmorPoints;
        System.out.println(Name + " equipped a Mark");
    }

    @Override
    public void Fly(){
        System.out.println(Name + " is Flying");
    }

    @Override
    public void Equip(Avenger enemy) {

        if(enemy.getClass() == Hulk.class) {
            System.out.println(Marvel.ANSI_IronMan + AlterEgo + ": Oh God! I need a \"Veronica\"!" + Marvel.ANSI_RESET);
            UseVeronica();
        }
    }

    @Override
    public void DeEquip() {
        if(isAlive && EquippedWeapon == Weapon.Veronica){
            UseMark();
            System.out.println(Marvel.ANSI_IronMan + AlterEgo + ": Where is your pants, Banner? :D" + Marvel.ANSI_RESET);
        }
    }
}
