package org.example;
// algomon class extending generic algomon type class and implementing the actions interface
public class SunnyCorn extends SunType implements Actions {
    //constructor for algomon type class
    public SunnyCorn() {
        super(" SunnyCorn", 25, 10, 40, 22);
    }

    //overriden methods from the actions interface
    @Override
    public String attack() {
        return "Sun Spell : dealt " + getAttack() + " points of damage";
    }

    @Override
    public String defense() {
        return "Sun Rise : blocked " + getDefense() + " points of damage";
    }

    @Override
    public String heal() {
        return "Sun Set : healed " + getHealth() * 0.35 + " points of damage";
    }

}

