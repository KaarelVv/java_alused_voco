package week10.farm_simulator.farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive {

    private final String name;
    private final double capacity;
    private double amount;
    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};


    public Cow() {
        this.name = NAMES[new Random().nextInt(NAMES.length)];
        this.capacity = 15 + new Random().nextInt(26);
        this.amount = 0;
    }

    public Cow(String name) {
        this.name = name;
        this.capacity = 15 + new Random().nextInt(26);
        this.amount = 0;
    }

    public String getName() {
        return this.name;
    }

    public double getAmount() {
        return this.amount;
    }

    public double getCapacity() {
        return this.capacity;
    }

    @Override
    public String toString() {
        return this.name + ' ' + this.amount + "/ " + this.capacity;
    }

    @Override
    public void liveHour() {
        double min = 0.7;
        double max = 2.0;
        if (this.amount <= this.capacity) {
            this.amount += Math.ceil(new Random().nextDouble((max - min + 1.0) + min));
        } else this.amount = this.capacity;

    }

    @Override
    public double milk() {
        Cow cow = new Cow();
        cow.amount = getAmount();
        this.amount = 0;

        return cow.amount;
    }
}
