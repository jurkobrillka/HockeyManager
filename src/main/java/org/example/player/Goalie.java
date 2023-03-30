package org.example.player;

public class Goalie extends Player{

    private int winsCounter;

    public Goalie(String name, int age, int winsCounter) {
        super(name, age);
        this.winsCounter = winsCounter;
    }

    public Goalie(String name, int age) {
        super(name, age);
    }
}
