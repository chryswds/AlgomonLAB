package org.example;
// algomon class extending generic algomon type class and implementing the actions interface
public class Squeezie extends WaterType implements Actions {
    //constructor for algomon type class
    public Squeezie() {
        super("Squeezie", 20, 10, 50, 30);
    }

    //overriden methods from the actions interface
    @Override
    public String attack() {
        return "Tempest waves : dealt " + getAttack() + " points of damage";
    }

    @Override
    public String defense() {
        return "Tsunami wall : blocked " + getDefense() + " points of damage";
    }

    @Override
    public String heal() {
        return "Cooling Waters : healed " + getHealth() * 0.25 + " points of damage";
    }

}