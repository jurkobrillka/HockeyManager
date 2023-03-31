package org.example.team;

import org.example.player.Player;

import java.util.ArrayList;

public class Team {

    //Objekt team vytvoreny kvoli funkciam Add, aby sme danych hracov mali kde pridavat
    //Novy team sa vytvori vo funkcii createNewTeam();

    String name;
    ArrayList<Player> players = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }
}
