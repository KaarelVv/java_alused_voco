package week1;

import java.util.Scanner;

public class Ex22 {
    Scanner input = new Scanner(System.in);

    public void askPassword() {
        String psw = "carrot";


        while (true) {
            System.out.print("Type a password: ");
            String userInput = input.nextLine();
            if (userInput.equals(psw)) {
                System.out.println("Right!\n");
                System.out.println("The secret is: jryy qbar!");
                break;
            }
            System.out.println("Wrong!");

        }


    }
}
