package week1;

import java.util.Scanner;

public class Ex21 {

    Scanner sc = new Scanner(System.in);

    public void leapYear() {
        System.out.println("Type a year");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year is a leap year");
        } else {
            System.out.println("The year is not a leap year");
        }
    }
}
