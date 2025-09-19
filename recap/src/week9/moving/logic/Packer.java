package week9.moving.logic;

import week9.moving.domain.Box;
import week9.moving.domain.Thing;

import java.util.ArrayList;

import java.util.List;


public class Packer {
    int boxesVolume;
    List<Box> boxes = new ArrayList<>();

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things){


        return this.boxes;
    }
}
