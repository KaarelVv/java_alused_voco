package week9.temps.application;

public class Thermometer implements Sensor {
    private boolean isOn = false;

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void on() {
        isOn = true;
    }

    @Override
    public void off() throws IllegalStateException {
        isOn = false;
    }

    @Override
    public int measure() {
        if (isOn) {
            int min = -30;
            int max = 30;
            //   System.out.println("Thermometer measure used");
            return min + (int) (Math.random() * ((max - min) + 1));
        } else
            return 0;
    }
}
