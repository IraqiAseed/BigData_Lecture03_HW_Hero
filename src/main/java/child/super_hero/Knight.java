package child.super_hero;

import model.RandomKickImpl;
import parent.Hero;

import java.util.Random;

public class Knight extends Hero {

    public Knight()
    {
        super(new Random().nextInt(11) + 2, new Random().nextInt(11) + 2);
        setKick(new RandomKickImpl(isAlive(),power));
    }



}