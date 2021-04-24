package child.super_hero;

import parent.Hero;

import java.util.Random;

public class Knight extends SuperHero {

    public Knight() {
        super(new Random().nextInt(11) + 2, new Random().nextInt(11) + 2);
    }


}