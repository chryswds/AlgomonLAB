package org.example;
// algomon class extending generic algomon type class and implementing the actions interface
public class Dragonoid extends FireType implements Actions {


    //constructor for algomon type class
    public Dragonoid() {
        super("Dragonoid", 60, 25, 15, 30);
    }


    //overriden methods from the actions interface
    @Override
    public String attack(){
        return "Dragon's inferno : dealt " + getAttack() + " points of damage";
    }

    @Override
    public String defense(){
        return "Ashes Dome : blocked " + getDefense() + " points of damage";
    }

    @Override
    public String heal(){
        return "Regenerating Flames : healed " + getHealth()*0.25 + " points of damage";
    }



}
