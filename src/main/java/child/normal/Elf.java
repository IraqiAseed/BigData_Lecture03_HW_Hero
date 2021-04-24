package child.normal;

import parent.Hero;

public class Elf extends Hero {


    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Hero enemy) {
        if (isAlive() && getPower() > 0 && enemy.isAlive()) {
            if (getPower() > enemy.getPower()) {
                enemy.kill();
            } else {
                enemy.decreasePower(1);
            }
        }
    }
}
