package model;

import parent.Hero;

import java.util.Random;

public class RandomKickImpl implements Kick{

    private boolean isAlive;
    private int power;

    public RandomKickImpl(boolean isAlive, int power) {
        this.power = power;
        this.isAlive = isAlive;
    }


    public void kick(Hero enemy) {

        if (isAlive && power > 0 && enemy.isAlive()) {
            int randDecrease = new Random().nextInt(power + 1); //random [0 - power]
            enemy.decreaseHitPoints(randDecrease);


        }
    }
}
