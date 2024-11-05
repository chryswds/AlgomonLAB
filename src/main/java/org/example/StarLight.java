package org.example;
// algomon class extending generic algomon type class and implementing the actions interface
public class StarLight extends StarType implements Actions {
    //constructor for algomon type class
    public StarLight() {
        super("StarLight", 20, 35, 15, 40);
    }

    //overriden methods from the actions interface
    @Override
    public String attack() {
        return "Blinding Light : dealt " + getAttack() + " points of damage";
    }

    @Override
    public String defense() {
        return "Shine Path : blocked " + getDefense() + " points of damage";
    }

    @Override
    public String heal() {
        return "Flash Light : healed " + getHealth() * 0.15 + " points of damage";
    }

}