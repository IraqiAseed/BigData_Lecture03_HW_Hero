package child.super_hero;

import model.RandomKickImpl;
import parent.Hero;

import java.util.Random;

public class King extends Hero {

    public King()
    {
        super(new Random().nextInt(11) + 5, new Random().nextInt(11) + 5);
        setKick(new RandomKickImpl(isAlive(),power));
    }


}
