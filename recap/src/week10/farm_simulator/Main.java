package week10.farm_simulator;

import week10.farm_simulator.farmsimulator.BulkTank;

public class Main {
    static void main() {
        BulkTank tank = new BulkTank();
        tank.getFromTank(100);
       tank.addToTank(25);
      tank.getFromTank(5);
        System.out.println(tank);

        tank = new BulkTank(50);
        tank.addToTank(100);
        System.out.println(tank);
    }
}
