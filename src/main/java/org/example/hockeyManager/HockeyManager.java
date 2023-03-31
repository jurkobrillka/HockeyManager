package org.example.hockeyManager;

import org.example.player.Defender;
import org.example.player.Forward;
import org.example.player.Goalie;
import org.example.player.Player;
import org.example.team.Team;

import java.util.Comparator;

public class HockeyManager {


    public HockeyManager() {
        Team team = createNewTeam();
        PrintNameAndAgeOfTheYoungestPlayer(team);

        System.out.println();

        AddNewForward(team, "Adam Sykora", 17);
        PrintNameAndAgeOfTheYoungestPlayer(team);
    }


    private Team createNewTeam() {
        Team newTeam = new Team("Slovan");
        System.out.println("Team " + newTeam.getName() + " was created.");

        AddNewDefender(newTeam, "Pavol Regenda", 20);
        AddNewGoalie(newTeam, "Jaroslav Halak", 30);
        AddNewForward(newTeam, "Juraj Slafkovsky", 19);

        return newTeam;
    }

    private void AddNewForward(Team team, String name, int age) {
        Forward forward = new Forward(name, age);
        team.getPlayers().add(forward);
        System.out.println("Player " + forward.getName() + " was added to the team " + team.getName());
    }

    private void AddNewDefender(Team team, String name, int age) {
        Defender defender = new Defender(name, age);
        team.getPlayers().add(defender);
        System.out.println("Player " + defender.getName() + " was added to the team " + team.getName());
    }


    private void AddNewGoalie(Team team, String name, int age) {
        Goalie goalie = new Goalie(name, age);
        team.getPlayers().add(goalie);
        System.out.println("Player " + goalie.getName() + " was added to the team " + team.getName());
    }

    private void PrintNameAndAgeOfTheYoungestPlayer(Team team) {
        team.getPlayers().sort(new Comparator<>() {
            @Override
            public int compare(Player o1, Player o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });

        System.out.println("Youngest player is: " + team.getPlayers().get(0).getName() + " (" + team.getPlayers().get(0).getAge() + ")");
    }


}
