package week1;

import java.util.Scanner;

public class Ex10 {
    Scanner sc = new Scanner(System.in);

    public void circumference() {
        System.out.print("Type of radius: ");
        int number = sc.nextInt();
        double circ = 2*Math.PI + number;
        System.out.println("Circumference of the circle: " + circ);
    }
}
