package child.normal;

import model.Kick;
import model.advancedKickImpl;
import parent.Hero;

public class Elf extends Hero {


    public Elf()
    {
        super(10, 10);
        setKick( new advancedKickImpl( isAlive(), power) ) ;
    }


    }

