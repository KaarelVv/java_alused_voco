package week2;

import java.util.Scanner;

public class Ex25 {
    Scanner reader = new Scanner(System.in);
    int sum = 0;
    int read;

    public void sumOfThree(){
        System.out.print("Type you first number: ");
        read = reader.nextInt();
        sum = read + sum;
        System.out.print("Type you second number: ");
        read = reader.nextInt();
        sum = read + sum;
        System.out.print("Type you third number: ");
        read = reader.nextInt();
        sum = read + sum;
        System.out.println("Sum:" + sum);
        }
    }


