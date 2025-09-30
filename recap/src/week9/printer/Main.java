package week9.printer;

import week9.printer.print.Printer;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args){
        Printer printer = new Printer("recap/src/textfile.txt");

        printer.printLinesWhichContain("Väinämöinen");
        System.out.println("-----");
        printer.printLinesWhichContain("Frank Zappa");
        System.out.println("-----");
        printer.printLinesWhichContain("");
        System.out.println("-----");
    }
}
