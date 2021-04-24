package factory;

import parent.Hero;

public interface IHeroFactory {
    public default Hero createHero() {
        return null;
    }
}
