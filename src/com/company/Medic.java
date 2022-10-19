package com.company;

public class Medic extends Hero {
    public Medic(int health, int damage) {
        super(health, damage);
    }
    @Override
    public void applySuperAbility(Hero[] hero) {
        System.out.println("Медик применил суперспособность - лечить");

    }
}
