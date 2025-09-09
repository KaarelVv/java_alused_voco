package week1;

import java.util.Scanner;

public class Ex19 {

    Scanner sc = new Scanner(System.in);

    public void ageCheck(){
        System.out.print("How old are you? ");
        int number = sc.nextInt();
        if(number > 0 && number < 120){
            System.out.println("OK");
        }else {
            System.out.println("Impossible!");
        }
    }
}
