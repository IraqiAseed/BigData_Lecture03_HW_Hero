package model;

import parent.Hero;

public class CryKickImpl implements Kick {

    private boolean isAlive;

    public CryKickImpl(boolean isAlive)
    {
        this.isAlive = isAlive;
    }

    @Override
    public void kick(Hero enemy) {
    if (isAlive)
          ToCry();
    }

    private void ToCry() {
        System.out.println("Hobbit: Cry Cry Cry .. can't kick");
    }
}
