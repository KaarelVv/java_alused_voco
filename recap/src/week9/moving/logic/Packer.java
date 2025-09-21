package week9.moving.logic;

import week9.moving.domain.Box;
import week9.moving.domain.Thing;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;


public class Packer {
    private final int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<>();
        Box box = new Box(this.boxesVolume);

        for (Thing t : things) {
            if (t.getVolume() > this.boxesVolume) {
                throw new IllegalArgumentException("Thing " + t + " is too large for any box!");
            }
            if (box.getVolume() + t.getVolume() > this.boxesVolume) {
                boxes.add(box);
                box = new Box(this.boxesVolume);
            }
            box.addThing(t);
        }

        if(box.getVolume() != 0){
            boxes.add(box);
        }

        return boxes;
    }
}
