package week7.dictionary;

import java.util.Scanner;

public class TextUserInterface {

    private final Scanner reader;
    private final Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.dictionary = dictionary;
        this.reader = reader;
    }

    public void start() {
        label:
        while (true) {
            System.out.print("Statement: ");
            String input = reader.next();
            switch (input) {
                case "quit":
                    System.out.println("Cheers!");
                    break label;
                case "add":
                    System.out.print("In Finnish: ");
                    String key = reader.next();
                    System.out.print("Translation: ");
                    String value = reader.next();
                    this.dictionary.add(key, value);
                    break;
                case "translate":
                    System.out.print("Give a word: ");
                    String word = reader.next();
                    System.out.print("Translation: ");
                    System.out.print(this.dictionary.translate(word));
                    break;
                default:
                    System.out.println("Unknown statement");
                    break;
            }
        }

    }

//    public void start() {
//        while (true) {
//            System.out.print("Statement: ");
//            String input = reader.next();
//            if (input.equals("quit")) {
//                System.out.println("Cheers!");
//                break;
//            } else if (input.equals("add")) {
//                System.out.print("In Finnish: ");
//                String key = reader.next();
//                System.out.print("Translation: ");
//                String value = reader.next();
//                this.dictionary.add(key,value);
//            } else if (input.equals("translate")) {
//                System.out.print("Give a word: ");
//                String word = reader.next();
//                System.out.print("Translation: ");
//                System.out.print(this.dictionary.translate(word));
//            } else {
//                System.out.println("Unknown statement");
//            }
//        }
//
//    }

}
