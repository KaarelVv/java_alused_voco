package week7.dictionary;

import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface( Scanner reader,Dictionary dictionary) {
        this.dictionary = dictionary;
        this.reader = reader;
    }

    public void start(){
        System.out.print("Statement: ");
        String input = reader.next();



        if(input.equals("quit")){
            System.out.println("Cheers!");
        }else{
            System.out.println("Unknown statement");
        }
    }
}
