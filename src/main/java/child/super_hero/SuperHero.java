package child.super_hero;

import parent.Hero;

import java.util.Random;

public abstract class SuperHero extends Hero {

    public SuperHero(int power, int hitPoints) {
        super(power, hitPoints);
    }

    @Override
    public void kick(Hero enemy) {

        if (isAlive() && getPower() > 0 && enemy.isAlive()) {
            int rand_decrease = new Random().nextInt(power + 1); //random [0 - power]
            enemy.decreaseHitPoints(rand_decrease);


        }
    }
}
