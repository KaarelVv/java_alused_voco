package week1;

import java.util.Scanner;

public class Ex18 {

    Scanner sc = new Scanner(System.in);

    public void grading(){

        System.out.print("Type the points [0-60] :");
        int number = sc.nextInt();
        if (number <= 29){
            System.out.println("Failed");
        } else if (number >=30 || number <= 34) {
            System.out.println("Grade 1");
        } else if (number >= 35  || number <= 39) {
            System.out.println("Grade 2");
        }
    }
}
