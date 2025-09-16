package week5.team_and_players;

import java.util.ArrayList;

public class Team {
    private final String name;
    private final ArrayList<Player> players;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
        this.maxSize = 16;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;

    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        if (players.size() < this.maxSize) {
            players.add(player);

        }
    }

    public void printPlayers() {
        for (Player player : players) {
            System.out.println(player);
        }
    }

    public int size() {
        return players.size();
    }

    public int goals() {
        int sum = 0;

        for (Player player : players) {
            sum += player.getGoals();
        }
        return sum;
    }
}
