package week5.student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student pekka = new Student("Pekka Mikkola", "013141590");
        System.out.println("name: " + pekka.getName());
        System.out.println("studentnumber: " + pekka.getStudentNumber());
        System.out.println(pekka);

        ArrayList<Student> list = new ArrayList<Student>();
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.print("Name");
            String name = input.next();
            if(name.isEmpty()){
                break;
            }
            System.out.println("studentnumber");
            String number = input.next();
            if(number.isEmpty()){
                break;
            }
            list.add(new Student(name, number));

        }
        for (Student s: list){
            System.out.println(s);
        }


    }

}
