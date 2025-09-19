package week9.moving.domain;



public class Item implements Thing, Comparable<Item> {

    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + " (" + getVolume() + " dmˇ3)";
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public int compareTo(Item otherItem) {

        if (this.getVolume() > otherItem.getVolume())
            return 1;
        else if (getVolume() < otherItem.getVolume()) {
            return -1;
        } else
            return 0;
    }
}
