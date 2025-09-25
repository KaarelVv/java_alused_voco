package week10.farm_simulator.farmsimulator;

public class BulkTank {

    private double volume;
    private final double capacity;

    public BulkTank(double capacity) {
        this.capacity = capacity;
    }

    public BulkTank() {
        this(2000);
        this.volume = 0;
    }

    public double getVolume() {
        return volume;
    }

    public double getCapacity() {
        return capacity;
    }

    public double howMuchFreeSpace() {
        return this.capacity - this.volume;
    }

    public void addToTank(double amount) {
        if (getVolume() + amount < this.capacity) {
            this.volume += amount;
        } else
            this.volume = this.capacity;
    }

    public void getFromTank(double amount) {
        if(this.volume - amount <= 0){
            this.volume = 0;
        }else
            this.volume -= amount;
    }

    @Override
    public String toString() {
        return volume + "/" +
                capacity;
    }
}
