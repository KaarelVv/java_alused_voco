package week8.interfaceExample;

import java.util.ArrayList;

public class EBook implements Readable {
    private String name;
    private ArrayList<String> pages;
    private int pageNumber;

    public EBook(String name, ArrayList<String> pages) {
        this.name = name;
        this.pages = pages;
        this.pageNumber = pageNumber;
    }

    public String getName() {
        return name;
    }

    public int howManyPages(){
        return 1;
    }


    public String read(){
        return "";
    }
}
