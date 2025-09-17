package week5.reformatory;

import week5.my_date.MyDate;

import java.util.Calendar;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    private MyDate birthMyDate;

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.weight = 0;
        this.height = 0;
        this.birthMyDate = new MyDate(day, month, year);
    }


//    public Person(String name) {
//        this.name = name;
//        this.age = 0;
//        this.weight = 0;
//        this.height = 0;
//    }

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthMyDate = birthday;
    }

    public Person(String name) {
        this.name = name;
        this.birthMyDate = new MyDate(Calendar.getInstance().get(Calendar.DATE), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.YEAR));
    }

    public void printPerson() {
        System.out.println(this.name + " I am " + this.age + " years old");
    }

    public void becomeOlder() {
        this.age++;
    }

    public boolean adult() {
        return this.age >= 18;
    }

    public double weightIndex() {
        double heightInMeters = this.height / 100.0;

        return this.weight / (heightInMeters * heightInMeters);
    }

    @Override
    public String toString() {
        return name + ", born " + birthMyDate;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int age() {
        // calculate the age based on the birthday and the current day
        // you get the current day as follows:
        // Calendar.getInstance().get(Calendar.DATE);
        // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        // Calendar.getInstance().get(Calendar.YEAR);

        int getDay = Calendar.getInstance().get(Calendar.DATE);
        int getMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int getYear = Calendar.getInstance().get(Calendar.YEAR);
        MyDate todayDate = new MyDate(getDay, getMonth, getYear);


        return this.birthMyDate.differenceInYears(todayDate);
    }

    public boolean olderThan(Person compared) {

        return this.birthMyDate.getDay() > compared.birthMyDate.getDay();
    }
}
