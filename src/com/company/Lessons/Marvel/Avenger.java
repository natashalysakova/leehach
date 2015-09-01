package com.company.Lessons.Marvel;

import com.company.Lessons.Fauna.IWalk;

import java.util.Random;


/**
 * Created by natas on 26.08.2015.
 */
public  abstract class Avenger implements IWalk, IFight, IEquipped {

    public String Name;
    public int Age;
    public Sex Gender;
    public boolean isAlive;
    public Weapon EquippedWeapon;
    protected String AlterEgo;
    protected int KillsCount;
    protected int Health;

    public Avenger(String name, int age, Sex gender, Weapon weapon, String alterEgo){

        Name = name;
        Age = age;
        Gender = gender;
        isAlive = true;
        EquippedWeapon = weapon;
        AlterEgo = alterEgo;
        KillsCount = 0;
        Health = 100;
    }

    public void SetWeapon(Weapon weapon) {
        if(weapon == Weapon.Mjolnir)
        {
            if(this.getClass() == Thor.class)
            {
                EquippedWeapon = weapon;
                System.out.println(Name + " equipped a " + weapon);

            }
            else {
                System.out.println(Marvel.ANSI_Thor + "Thor: You are not worthy use a Mjolnir!" + Marvel.ANSI_RESET);
            }
        }
        else {
            EquippedWeapon = weapon;
            System.out.println(Name + " equipped a " + weapon);

        }
    }

    private void HealthState(int HealthDown){

        Health -= HealthDown;
        if(Health <= 0){
            Health = 0;
            isAlive = false;
        }

        System.out.println(Name + " get " + HealthDown + " damage. HP = " + Health);
    }

    @Override
    public void Fight() {
        Marvel.AddEmptyLine();

        if (!isAlive){
            return;
        }

        Random R = new Random();
        int Damage = R.nextInt(5);
        HealthState(Damage);


        int FightResult = R.nextInt(100);
        if (FightResult <= 35){
            KillsCount += 1;
            PrintKills();
        }
    }

    private void PrintKills(){

        System.out.println(Name + " has " + KillsCount + " kills used " + EquippedWeapon);
    }


    @Override
    public void Fight(Avenger enemy) {
        Marvel.AddEmptyLine();

        if (!isAlive || !enemy.isAlive){
            return;
        }

        this.Equip(enemy);
        enemy.Equip(this);

        Random R = new Random();

        do {
            int FightResult = R.nextInt();
            if ((FightResult % 2) == 0){
                int Damage = R.nextInt(10);
                enemy.HealthState(Damage);
            }
            else {
                int Damage = R.nextInt(10);
                HealthState(Damage);
            }
        }
        while (isAlive == true && enemy.isAlive == true);

        if (isAlive == true){
            System.out.println(Name + " is alive and " + enemy.Name + " is dead");
            KillsCount += 1;
        }
        else {
            System.out.println(enemy.Name + " is alive and " + Name + " is dead");
            enemy.KillsCount += 1;
        }

        this.DeEquip();
        enemy.DeEquip();

    }


    public String GetAlterEgoName (String alterEgo){

        if (alterEgo.equals("Jarvis")){
            return AlterEgo;
        }
        else {
            return "You are not right";
        }
    }

    @Override
    public void Walk() {

        if (!isAlive){
            return;
        }
        System.out.println(Name + " walking");
    }
}
