package week10.farm_simulator.farmsimulator;

import java.util.Collection;

public class Barn {

    private final BulkTank bulkTank;
    Boolean activated = true;

    public Barn(BulkTank bulkTank) {
        this.bulkTank = bulkTank;
    }

    public BulkTank getBulkTank() {
        return bulkTank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        activated = true;
        milkingRobot.setBulkTank(bulkTank);
    }

    public void takeCareOf(Cow cow) {
        if (activated) {

        } else throw new IllegalStateException();

    }

    public void takeCareOf(Collection<Cow> cows) {

    }

    @Override
    public String toString() {
        return "" +
                bulkTank;
    }
}
