package manager;

import factory.HeroFactoryImpl;
import parent.Hero;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GameManager {

    private final static int NUMBER_OF_HEROES = 20;

    static public void fight(Hero c1, Hero c2) {
        if (!(c1.isAlive() && c2.isAlive()))
            return;

        System.out.println("BEFORE: " + c1.getClass().getSimpleName() + "-" + c1.hashCode() + "[Hit Points= "
                + c1.getHitPoints() + " Power: " + c1.getPower() + "] vs " + c2.getClass().getSimpleName() + "-"
                + c2.hashCode() + "[Hit Points= " + c2.getHitPoints() + " Power: " + c2.getPower() + "]");

        c1.kick(c2);

        System.out.println("AFTER:  " + c1.getClass().getSimpleName() + "-" + c1.hashCode() + "[Hit Points= "
                + c1.getHitPoints() + " Power: " + c1.getPower() + "] vs " + c2.getClass().getSimpleName() + "-"
                + c2.hashCode() + "[Hit Points= " + c2.getHitPoints() + " Power: " + c2.getPower() + "]\n");
    }

    public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<>();

        for (int i = 0; i < NUMBER_OF_HEROES; i++) {
            HeroFactoryImpl hero_factory = new HeroFactoryImpl();
            heroes.add(hero_factory.createHero());
        }


        while (true) {
            for (Hero hero : heroes) {
                for (Hero enemy : heroes) {
                    if (hero != enemy)
                        fight(hero, enemy);
                }

            }

            Iterator<Hero> itr = heroes.iterator();
            while (itr.hasNext()) {
                Hero x = itr.next();
                if (!x.isAlive())
                    itr.remove();
            }

            if (heroes.size() == 1)
                break;
        }

        System.out.println("WINNER: " + heroes.get(0).getClass().getSimpleName() + "-" + heroes.get(0).hashCode());


    }
}
