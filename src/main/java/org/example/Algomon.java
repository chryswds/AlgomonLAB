package org.example;

//Abstract class that creates a genberic algomon, to extended by each type and specific algomon
public abstract class Algomon {


    //attributes of generic algomon class
    private String name;
    private String type;
    private int health;
    private int attack;
    private int defense;
    private int speed;

    //constructor of generic algomon class
    public Algomon(String name,String type, int attack, int health, int defense, int speed) {
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.health = health;
        this.defense = defense;
        this.speed = speed;
    }


    //getters and setters for generic algomon's attributes
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
