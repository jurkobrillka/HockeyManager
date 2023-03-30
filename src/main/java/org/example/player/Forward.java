package org.example.player;

public class Forward extends Player{

    private int goalsCounter;

    public Forward(String name, int age, int goalsCounter) {
        super(name, age);
        this.goalsCounter = goalsCounter;
    }

    public Forward(String name, int age){
        super(name, age);
    }
}
