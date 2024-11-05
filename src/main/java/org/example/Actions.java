package org.example;

public interface Actions {



    //Enum that allows players to use a specific type of action
    public enum Action{
        OFFENSIVE,
        DEFENSIVE,
        HEALING,
    }

    //abstract methods that will be overriden by algomon fire type child classes describing the specific actions to each algomon
    public String attack();
    public String defense();
    public String heal();




}
