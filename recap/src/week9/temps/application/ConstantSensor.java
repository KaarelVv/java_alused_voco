package week9.temps.application;

public class ConstantSensor implements Sensor{

    private final int parameter;


    public ConstantSensor(int parameter) {
        this.parameter = parameter;
    }


    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public int measure() {
        //System.out.println("Constant sensor" + this.parameter);
        return this.parameter;

    }
}
