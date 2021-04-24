package factory;

import child.normal.Elf;
import child.normal.Hobbit;
import child.super_hero.King;
import child.super_hero.Knight;
import parent.Hero;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HeroFactory implements IHeroFactory {

    private Map<Integer, Hero> map;

    public HeroFactory() {
        map = new HashMap<>();
        map.put(0, new Hobbit());
        map.put(1, new Elf());
        map.put(2, new King());
        map.put(3, new Knight());
    }

    public Hero createHero() {
        return map.get(new Random().nextInt(4));
    }
}
