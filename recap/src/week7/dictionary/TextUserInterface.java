package week7.dictionary;

import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.dictionary = dictionary;
        this.reader = reader;
    }

    public void start() {
        while (true) {
            System.out.println("Statement");
            String input = reader.next();
            if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;
                
            } else if (input.equals("add")) {
                
                
            } else if (input.equals("translate")) {
                
            } else {
                System.out.println("Unknown statement");
            }
        }

    }
}
