package com.company;

public abstract class Hero implements HavingSuperAbility {
    public int Health;
    public int Damage;

    public Hero(int health, int damage) {
        Health = health;
        Damage = damage;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    @Override
    public String toString() {
        return "Hero: " +
                "Health=" + Health +
                ", Damage=" + Damage ;
    }
}
