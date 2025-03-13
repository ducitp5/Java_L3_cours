package iterable.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.o7planning.list.ex.Book;

public class List_stream {

    public static void main(String[] args) {
    	
        Book b1 = new Book("Python Tutorial", 100f);
        Book b2 = new Book("HTML Tutorial", 120f);
        
        // Create an Unmodifiable List
        List<Book> bookList1 = List.of(b1, b2);
        
        // Create a List of Books using ArrayList
        List<Book> bookList = new ArrayList<Book>();
        
        bookList.add(new Book("Java Tutorial", 300f));
        bookList.add(new Book("C# Tutorial", 200f));
        
        // Append all elements to the end of list.
        bookList.addAll(bookList1);
        
        // Using Stream
        
        Stream<Book> $bookStream = bookList.stream(); // Filter Books with price > 100
        Stream<Book> $bookStream2 = bookList.stream().filter(b -> b.getPrice() > 100); // Filter Books with price > 100

        $bookStream2.forEach(b -> System.out.println(b.getTitle() +" / " + b.getPrice()));
        
        System.out.println("bb " +bookList);
    }
}