package week9.temps.application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private final List<Sensor> sensorList;
    private final List<Integer> temps;

    public AverageSensor() {
        this.sensorList = new ArrayList<>();
        this.temps = new ArrayList<>();
    }

    public void addSensor(Sensor additional) {
        this.sensorList.add(additional);
    }

    @Override
    public boolean isOn() {

        if (sensorList.isEmpty()) {
            return false;
        }
        for (Sensor s : sensorList) {
            if (!s.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {

        for (Sensor s : sensorList) {
            s.on();
        }
    }

    @Override
    public void off() throws IllegalStateException {

    }

    @Override
    public int measure() {

        int sum = 0;
        for (Sensor sensor : sensorList) {
            sum += sensor.measure();
        }
        int average = sum / sensorList.size();
        temps.add(average);
        return average;
    }

    public List<Integer> readings() {
        return temps;
    }
}
