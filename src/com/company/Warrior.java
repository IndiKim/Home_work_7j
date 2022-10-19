package com.company;

public class Warrior extends Hero{

    public Warrior(int health, int damage) {
        super(health, damage);
    }
    @Override
    public void applySuperAbility(Hero[] hero) {
        System.out.println("Воин применил суперспособность - критическая атака");

    }
}
