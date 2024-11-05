
package org.example;

// algomon class extending generic algomon type class and implementing the actions interface
public class MoonCrawler extends MoonType implements Actions {

    //constructor for algomon type class
    public MoonCrawler() {
        super("MoonCrawler", 30, 25, 15, 40);
    }

    //overriden methods from the actions interface
    @Override
    public String attack() {
        return "Moon Spirit : dealt " + getAttack() + " points of damage";
    }

    @Override
    public String defense() {
        return "Moon Shadow : blocked " + getDefense() + " points of damage";
    }

    @Override
    public String heal() {
        return "Moon Flower : healed " + getHealth() * 0.45 + " points of damage";
    }
}

