package week10.farm_simulator.farmsimulator;

public class BulkTank {

    private double volume = 0;
    private double capacity;

    public BulkTank(double capacity) {
        this.capacity = capacity;
    }

    public BulkTank() {
        this(2000);
    }

    public double getVolume() {
        return volume;
    }

    public double getCapicity() {
        return capacity;
    }

    public double howMuchFreeSpace() {
        return this.capacity - this.volume;
    }

    public void addToTank(double amount) {
        if (howMuchFreeSpace() + amount <= this.capacity) {
            this.volume += amount;
        } else
            this.volume = this.capacity;
    }

    public void getFromTank(double amount) {
        if (this.volume >= amount) {
            this.volume -= amount;
        } else
            this.volume = this.volume - amount;
    }

    @Override
    public String toString() {
        return volume + "/" +
                capacity;
    }
}
