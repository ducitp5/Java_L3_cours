package iterable.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.o7planning.list.ex.Book;

public class ListEx3 {

    public static void main(String[] args) {
    	
        Book b1 = new Book("Python Tutorial", 100f);
        Book b2 = new Book("HTML Tutorial", 120f);
        Book b3 = new Book("Java Tutorial", 300f);
        
        Book[] bookArray =  {b1, b2, b3};
        
        Book b4 = new Book("PHP", 400f);

        // Create a Fixed-size List.
        List<Book> bookList = Arrays.asList(bookArray);
        
        // Create a modifiable List
        List<Book> bookList2 = new ArrayList<>(bookList);

        bookList2.add(b4);  // Now this works!
        
        for(Book b: bookList2)  {
            System.out.println("Book: " + b.getTitle());
        }
    }
}