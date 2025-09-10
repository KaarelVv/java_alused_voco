package week2;

import java.util.Scanner;

public class Ex36 {
    public Scanner reader = new Scanner(System.in);
    int sum = 0;
    int count = 0;
    double avg;
    int even;
    int odd;

    public void readingNumbers() {
        while (true) {
            int read = reader.nextInt();
            if (read == -1) {
                break;
            }
            if(read % 2 == 0){
                even++;
            }else{
                odd++;
            }
            sum = sum + read;
            count++;

        }
        avg = (double) sum / count;

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("The count is " + count);
        System.out.println("The average is " + avg);
        System.out.println("Even numbers " + even);
        System.out.println("Odd numbers " + odd);

    }

}
