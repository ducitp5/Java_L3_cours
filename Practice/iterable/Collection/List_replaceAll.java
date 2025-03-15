package iterable.Collection;

import java.util.ArrayList;
import java.util.List;

import org.o7planning.list.ex.Book;

public class List_replaceAll {

    public static void main(String[] args) {

    	Book b1 = new Book("Python Tutorial", 100f);
        Book b2 = new Book("HTML Tutorial", 120f);
        Book b3 = new Book("Java Tutorial", 300f);  
        Book b4 = new Book("Javafx Tutorial", 100f);  
        Book b5 = new Book("CSS Tutorial", 300f);  
        
        List<Book> bookList = new ArrayList<Book>();
        
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        bookList.add(b5);
        
        // Replace Book with new Book with the price increased by 50%.
        bookList.replaceAll(b -> new Book(b.getTitle(), b.getPrice() * 150f/100));
        
        for(Book b: bookList)  {
            System.out.println(b.getPrice() + " : " + b.getTitle());
        }
    }
}