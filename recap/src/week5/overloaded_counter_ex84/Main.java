package week5.overloaded_counter_ex84;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(10,true);
        System.out.println(counter.value());
        counter.decrease();
        System.out.println(counter.value());
        counter.decrease();
        System.out.println(counter.value());
        counter.decrease();
        counter.decrease();
        System.out.println(counter.value());
        counter.increase(10);
        System.out.println(counter.value());
        counter.decrease();
        counter.decrease();
        counter.decrease();
        System.out.println(counter.value());
        counter.decrease();
        counter.decrease();
        counter.decrease();
        System.out.println(counter.value());
        counter.decrease();
        System.out.println(counter.value());
        counter.decrease();
        System.out.println(counter.value());
        counter.decrease();
        System.out.println(counter.value());
        counter.decrease();
        System.out.println(counter.value());
        counter.decrease();
        System.out.println(counter.value());
        counter.decrease();

        System.out.println(counter.value());
    }
}
