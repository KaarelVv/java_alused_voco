package week7.dictionary;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

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

//        Scanner reader = new Scanner(System.in);
//        Dictionary dict = new Dictionary();
//
//        TextUserInterface ui = new TextUserInterface(reader, dict);
//        ui.start();

//        String input = "translate\n" + "monkey\n"  +
//                "translate\n" + "cheese\n" +
//                "add\n"  + "cheese\n" + "juusto\n" +
//                "translate\n" + "cheese\n" +
//                "quit\n";

        String input = "add\n"  + "cheese\n" + "juusto\n" +
                "add\n"  + "bier\n" + "olut\n" +
                "add\n"  + "book\n" + "kirja\n" +
                "add\n"  + "computer\n" + "tietokone\n" +
                "add\n"  + "auto\n" + "car\n" +
                "translate\n" + "cheese\n" +
                "quit\n";

        Scanner reader = new Scanner(input);
        Dictionary dictionary = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();



    }



}