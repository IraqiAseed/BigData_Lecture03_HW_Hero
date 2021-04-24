package child.super_hero;

import parent.Hero;

import java.util.Random;

public class King extends Hero {

    public King() {
        super(new Random().nextInt(11) + 5, new Random().nextInt(11) + 5);
    }

    @Override
    public void kick(Hero enemy) {

        if (isAlive() && getPower() > 0 && enemy.isAlive()) {
            int rand_decrease = new Random().nextInt(power + 1); //random [0 - power]
            enemy.decreaseHit_points(rand_decrease);


        }
    }
}
