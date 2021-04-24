package child.normal;

import model.CryKickImpl;
import model.RandomKickImpl;
import parent.Hero;

public class Hobbit extends Hero {

    public Hobbit()
    {
        super(0, 3);
        setKick(new CryKickImpl(isAlive()));
    }


}
