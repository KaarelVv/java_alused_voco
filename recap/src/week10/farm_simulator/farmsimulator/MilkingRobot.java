package week10.farm_simulator.farmsimulator;

public class MilkingRobot implements Milkable {

    private BulkTank bulkTank;

    public MilkingRobot() {
    }

    public BulkTank getBulkTank() {
        return bulkTank;
    }

    public void setBulkTank(BulkTank bulkTank) {
        this.bulkTank = bulkTank;
    }

    public void milk(Milkable milkable) {
        if (getBulkTank() == null) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        } else {

            bulkTank.addToTank(milkable.milk());
        }
    }

    @Override
    public double milk() throws IllegalStateException {

        return 1.0;
    }
}
