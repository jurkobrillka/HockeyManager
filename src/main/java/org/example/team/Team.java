package org.example.team;

import org.example.player.Player;

import java.util.ArrayList;

public class Team {

    String name;
    ArrayList<Player> players = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }
}
