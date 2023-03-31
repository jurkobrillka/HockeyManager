package org.example.player;


public abstract class Player {

    //Zvolil som abstraktnu triedu pre predpoklad ze kazdy novy hrac musi byt nejaky post.
    private String name;
    private int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

}
