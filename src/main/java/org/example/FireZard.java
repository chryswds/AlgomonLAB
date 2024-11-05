package org.example;

// algomon class extending generic algomon type class and implementing the actions interface
public class FireZard extends FireType implements Actions {


    //constructor for algomon type class
    public FireZard() {
        super("FireZard", 50, 20, 10, 25);
    }




    //overriden methods from the actions interface
    @Override
    public String attack(){
        return "Fire Breath : dealt " + getAttack() + " points of damage";
    }

    @Override
    public String defense(){
        return "Fire Wall : blocked " + getDefense() + " points of damage";
    }

    @Override
    public String heal(){
        return "Cauterising breath : healed " + getHealth()*0.25 + " points of damage";
    }



}
