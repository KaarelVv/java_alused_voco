package week1;

import java.util.Scanner;

public class Ex14 {


    public void isPositive() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }
}
