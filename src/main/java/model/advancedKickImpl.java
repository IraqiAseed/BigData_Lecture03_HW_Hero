package model;

import parent.Hero;

public class advancedKickImpl implements Kick {

    private boolean isAlive;
    private int power;

    public advancedKickImpl(boolean isAlive, int power) {
       this.power = power;
       this.isAlive = isAlive;
    }

    @Override
    public void kick(Hero enemy) {
        if (isAlive && power > 0 && enemy.isAlive()) {
            if (power > enemy.getPower()) {
                enemy.kill();
            } else {
                enemy.decreasePower(1);
            }
        }
    }
}

