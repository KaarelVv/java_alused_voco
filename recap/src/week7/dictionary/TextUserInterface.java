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
        System.out.println("""
                Statements:
                  add - adds a word pair to the dictionary
                  translate - asks a word and prints its translation
                  quit - quits the text user interface""");
        System.out.println();
        while (true) {
            System.out.print("Statement: ");
            String input = reader.nextLine();
            if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (input.equals("add")) {
                this.add();
            } else if (input.equals("translate")) {
                this.translate();
            } else {
                System.out.println("Unknown statement");
            }
            System.out.println();
        }

    }

    private void translate() {
        System.out.print("Give a word: ");
        String word = reader.nextLine();
        System.out.print("Translation: ");
        System.out.print(this.dictionary.translate(word));
    }

    private void add() {
        System.out.print("In Finnish: ");
        String key = reader.nextLine();
        System.out.print("Translation: ");
        String value = reader.nextLine();
        this.dictionary.add(key, value);
    }


}
