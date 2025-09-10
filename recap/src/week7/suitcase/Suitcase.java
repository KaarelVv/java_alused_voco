package week7.suitcase;

import java.util.ArrayList;
import java.util.Comparator;

public class Suitcase {



    private final int weightLimit;
    private final ArrayList<Thing> things;
    int totalWeight = 0;

    public Suitcase(int weightLimit) {
        this.weightLimit = weightLimit;
        this.things = new ArrayList<Thing>();
    }

    public void addThing(Thing thing) {
        if (totalWeight + thing.getWeight() <= weightLimit) { // siin loogika, et mittel isada järgmist eset!
            this.things.add(thing);
            totalWeight += thing.getWeight();
        }
    }

    public void printThings() {
        for (Thing t : this.things) {
            System.out.println(t);
        }
        System.out.println("Total weight: " + totalWeight + " kg");
    }

    public Thing heaviestThing() {
        return things
                .stream()
                .max(Comparator.comparing(Thing::getWeight))
                .orElseThrow(NullPointerException::new);
    }

    @Override
    public String toString() {
        if (totalWeight == 0) {
            return "empty" + " (" + totalWeight + "kg)";
        } else {
            return things.size() +
                    " things" + " (" + totalWeight + "kg)";
        }
    }

    public ArrayList<Thing> getThings() {
        return things;
    }
}
