import week7.dictionary.Dictionary;
import week7.dictionary.TextUserInterface;
import week7.suitcase.Container;
import week7.suitcase.Thing;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Ex16 ex16 = new Ex16();
//        ex16.evenOrOdd(sc.nextInt());

//        Ex14 ex14 = new Ex14();
//        ex14.isPositive();

//        Ex18 ex18 = new Ex18();
//        ex18.grading();

//        Ex10 ex10 = new Ex10();
//        ex10.circumference();

//        Ex19 ex19 = new Ex19();
//        ex19.ageCheck();

//        Ex25 ex25 = new Ex25();
//        ex25.sumOfThree();

//        Ex26 ex26 = new Ex26();
//        ex26.sumOfMany();

//        Ex36 ex36 = new Ex36();
//        ex36.readingNumbers();

        //-----------------------------------------------------//

        Thing book = new Thing("Atomic habit", 2);
        Thing mobile = new Thing("Nokia 3310", 1);
        Thing brick = new Thing("Brick", 4);


//        System.out.println("Book name: " + book.getName());
//        System.out.println("Book weight: " + book.getWeight());
//
//        System.out.println("Book: " + book);
//        System.out.println("Mobile: " + mobile);

 //       Suitcase suitcase = new Suitcase(10);
//        System.out.println(suitcase);

//        suitcase.addThing(book);
//        System.out.println(suitcase);

//        suitcase.addThing(mobile);
//        System.out.println(suitcase);

//        suitcase.addThing(brick);
//        System.out.println(suitcase);

//        System.out.println("Your suitcase contains the following things:");
//        suitcase.printThings();

//        Thing heaviest = suitcase.heaviestThing();
//        System.out.println("The heaviest thing: " + heaviest);


        //----------------------------------------------
//        Suitcase tomsCase = new Suitcase(10);
//        tomsCase.addThing(book);
//        tomsCase.addThing(mobile);
//
//        Suitcase georgesCase = new Suitcase(10);
//        georgesCase.addThing(brick);
//
//        Container container = new Container(1000);
//        container.addSuitcase(tomsCase);
//        container.addSuitcase(georgesCase);
//
//        System.out.println(container);
//
//        System.out.println("There are the following things in the container suitcases:");
//        container.printThings();
//        Container container = new Container(1000);
//        addSuitcasesFullOfBricks(container);
//        System.out.println(container);

//        Dictionary dictionary = new Dictionary();
//
//        dictionary.add("apina", "monkey");
//        dictionary.add("banaani", "banana");
//        System.out.println(dictionary.amountOfWords());
//
//        dictionary.add("cembalo", "harpsichord");
//        System.out.println(dictionary.amountOfWords());

//        Dictionary dictionary = new Dictionary();
//        dictionary.add("apina", "monkey");
//        dictionary.add("banaani", "banana");
//        dictionary.add("cembalo", "harpsichord");
//
//        ArrayList<String> translations = dictionary.translationList();
//        for(String translation: translations) {
//            System.out.println(translation);
//        }

        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dict);
        ui.start();

    }


//    public static void addSuitcasesFullOfBricks(Container container) {
//    }
}