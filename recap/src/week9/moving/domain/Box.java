package week9.moving.domain;

import java.util.ArrayList;

public class Box implements Thing {
    private int maximumCapacity;
    private ArrayList<Thing> stuff = new ArrayList<>();
    private int totalVolume;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }


    public boolean addThing(Thing thing) {

        if (getVolume() <= maximumCapacity) {
            stuff.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        for (Thing i : stuff){
            System.out.println(i);
        }
        return 0;
    }
}
