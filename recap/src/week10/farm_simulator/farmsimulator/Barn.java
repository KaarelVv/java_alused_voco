package week10.farm_simulator.farmsimulator;

import java.util.Collection;

public class Barn {

    private final BulkTank bulkTank;


    public Barn(BulkTank bulkTank) {
        this.bulkTank = bulkTank;
    }

    public BulkTank getBulkTank() {
        return this.bulkTank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        milkingRobot.setBulkTank(this.bulkTank);

    }

    public void takeCareOf(Cow cow) {
        if (getBulkTank() != null) {
            this.bulkTank.addToTank(cow.milk());
        } else throw new IllegalStateException();

    }

    public void takeCareOf(Collection<Cow> cows) {
        if (getBulkTank() != null) {
            for (Cow cow : cows) {
                this.bulkTank.addToTank(cow.milk());
            }
        } else throw new IllegalStateException();
    }

    @Override
    public String toString() {
        return this.bulkTank.toString();
    }
}
