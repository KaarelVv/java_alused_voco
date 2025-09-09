package week2;

import java.util.Scanner;

public class Ex26 {
    Scanner reader = new Scanner(System.in);

    int sum = 0;

    public void sumOfMany() {
        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }
            sum = read + sum;
            System.out.println("Sum now: " + sum);
        }
        System.out.println("Sum in the end: " + sum);
    }
}
