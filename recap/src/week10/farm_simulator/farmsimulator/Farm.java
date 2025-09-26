package week10.farm_simulator.farmsimulator;

import week10.groups.movable.Movable;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Farm implements Alive {

    private final String owner;
    private final Barn barn;
    List<Cow> allCows = new ArrayList<>();

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
    }

    public String getOwner() {
        return owner;
    }

    public void addCow(Cow cow) {
        allCows.add(cow);
    }

    @Override
    public void liveHour() {
        for (Cow cow : allCows) {
            cow.liveHour();
        }
    }

    public void manageCows(){
        barn.takeCareOf(allCows);

    }

    @Override
    public String toString() {
        if (allCows.isEmpty()) {
            return "Farm owner: " + owner + '\n' +
                    "Barn bulk tank: " + barn + '\n' +
                    "No cows.";
        } else{
            StringJoiner sj = new StringJoiner(System.lineSeparator());
            for (Cow c : allCows) {
                sj.add('\t' + String.valueOf(c));
            }
                return "Farm owner: " + owner + '\n' +
                        "Barn bulk tank: " + barn + '\n' +
                        "Animals:" + '\n'+ sj;

        }

    }
}
