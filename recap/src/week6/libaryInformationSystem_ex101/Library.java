package week6.libaryInformationSystem_ex101;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final ArrayList<Book> collection = new ArrayList<>();


    public Library() {
    }
    public void addBook(Book newBook){

        this.collection.add(newBook);
    }

    public void printBooks(){

        for (Book book : collection){
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<>();
        for (Book book : collection){
            if (StringUtils.included(book.title(), title))
                found.add(book);

        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<>();
        for (Book book : collection){
            if (StringUtils.included(book.publisher(), publisher))
                found.add(book);
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<>();
        for (Book book : collection){
            if(book.year() == year){
                found.add(book);
            }
        }
        return found;
    }
}
