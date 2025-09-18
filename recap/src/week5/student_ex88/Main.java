package week5.student_ex88;

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

        while (true) {
            System.out.print("name: ");
            String name = input.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("student-number: ");
            String number = input.nextLine();
            if (number.isEmpty()) {
                break;
            }
            list.add(new Student(name, number));

        }
        for (Student s : list) {
            System.out.println(s);
        }

        System.out.print("Give the search term: ");
        String search = input.nextLine();
        System.out.println("Result: ");
        for (Student st : list) {
            if (st.getName().contains(search)) {
                System.out.println(st);
            }
        }
    }
}
