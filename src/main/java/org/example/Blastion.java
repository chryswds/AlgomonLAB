package org.example;

// algomon class extending generic algomon type class and implementing the actions interface
public class Blastion extends WaterType implements Actions {

    //constructor for algomon type class
    public Blastion() {
        super("Blastion", 45, 15, 50, 40);
    }



    //overriden methods from the actions interface
    @Override
    public String attack(){
        return "Water Blast : dealt " + getAttack() + " points of damage";
    }

    @Override
    public String defense(){
        return "Water bubble : blocked " + getDefense() + " points of damage";
    }

    @Override
    public String heal(){
        return "Healing waters : healed " + getHealth()*0.25 + " points of damage";
    }


}
