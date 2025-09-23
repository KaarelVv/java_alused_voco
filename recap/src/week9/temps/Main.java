package week9.temps;

import week9.temps.application.AverageSensor;
import week9.temps.application.ConstantSensor;
import week9.temps.application.Sensor;
import week9.temps.application.Thermometer;

public class Main {
    public static void main(String[] args) {
//        ConstantSensor ten = new ConstantSensor(10);
//        ConstantSensor minusFive = new ConstantSensor(-5);
//        System.out.println(ten.measure());
//        System.out.println(minusFive.measure());
//        System.out.println(ten.isOn());
//        ten.off();
//        System.out.println(ten.isOn());



//        Sensor kumpula = new Thermometer();
//        kumpula.on();
//        System.out.println("the temperature in Kumpula is "+kumpula.measure() + " degrees");
//
//        Sensor kaisaniemi = new Thermometer();
//        Sensor helsinkiVantaa = new Thermometer();
//
//        AverageSensor helsinkiArea = new AverageSensor();
//        helsinkiArea.addSensor(kumpula);
//        helsinkiArea.addSensor(kaisaniemi);
//        helsinkiArea.addSensor(helsinkiVantaa);
//
//        helsinkiArea.on();
//        System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");



        Sensor kumpula = new Thermometer();
      //System.out.println("Created thermometer,called kumpla measure :" + kumpula.measure());
        Sensor kaisaniemi = new Thermometer();
        Sensor helsinkiVantaa = new Thermometer();

        AverageSensor helsinkiArea = new AverageSensor();
        helsinkiArea.addSensor(kumpula);
       //System.out.println("Added kupla  sensor and measured again: " +kumpula.measure());
        helsinkiArea.addSensor(kaisaniemi);
        helsinkiArea.addSensor(helsinkiVantaa);

        helsinkiArea.on();
        System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");
        System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");
        System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");

        System.out.println("readings: "+helsinkiArea.readings());

    }
}
