package child.super_hero;

import parent.Hero;

import java.util.Random;

public class King extends SuperHero {

    public King()
    {
        super(new Random().nextInt(11) + 5, new Random().nextInt(11) + 5);
    }


}
