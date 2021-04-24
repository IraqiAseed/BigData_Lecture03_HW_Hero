package child.normal;

import parent.Hero;

public class Hobbit extends Hero {

    public Hobbit() {
        super(0, 3);
    }

    @Override
    public void kick(Hero enemy) {
        if (isAlive())
            ToCry();
    }

    private void ToCry() {
        System.out.println("Hobbit: Cry Cry Cry .. can't kick");
    }
}
