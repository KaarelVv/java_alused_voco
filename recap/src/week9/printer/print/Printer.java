package week9.printer.print;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Printer {

    private final String fileName;

    public Printer(String fileName) {
        this.fileName = fileName;
    }

    public void printLinesWhichContain(String word) {
        try {
            File file = new File(this.fileName);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.contains(word)) {
                    System.out.println(line);
                }
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("We couldn't read the file! Message: " + e.getMessage());
        }


    }
}
