package factory;

import parent.Hero;

public interface HeroFactory {
    default Hero createHero() {
        return null;
    }
}
