package org.example;


// algomon class extending generic algomon type class and implementing the actions interface
public class Rockamon extends EarthType implements Actions {


    //constructor for algomon type class
    public Rockamon() {
        super("Rockamon", 30, 70, 50, 25);
    }


    //overriden methods from the actions interface
    @Override
    public String attack() {
        return "Meteore Shower : dealt " + getAttack() + " points of damage";
    }

    @Override
    public String defense() {
        return "Mountain Wall : blocked " + getDefense() + " points of damage";
    }

    @Override
    public String heal() {
        return "Rich Soil : healed " + getHealth() * 0.25 + " points of damage";
    }

}