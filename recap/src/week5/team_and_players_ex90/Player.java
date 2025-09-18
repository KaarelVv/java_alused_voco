package week5.team_and_players_ex90;

public class Player {
    private final String name;
    private final int goals;

    public Player(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }

    public Player(String name) {
        this(name, 0);
    }

    public int getGoals() {
        return this.goals;
    }

    @Override
    public String toString() {
        return name + "," +
                " goals " + goals;
    }
}
