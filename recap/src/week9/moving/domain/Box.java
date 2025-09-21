package week9.moving.domain;

import java.util.ArrayList;

public class Box implements Thing {
    private final int maximumCapacity;
    private final ArrayList<Thing> box = new ArrayList<>();

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }


    public boolean addThing(Thing thing) {
        if (getVolume() <= this.maximumCapacity) {
            this.box.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        int i=0;
        for (Thing thing : this.box){
            i += thing.getVolume();
        }
        return i;
    }
}
