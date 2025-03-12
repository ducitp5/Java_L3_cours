package iterable.Collection;

import java.util.ArrayList;
import java.util.List;

import org.o7planning.list.ex.Book;

public class List_sort_ex1 {

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
        
        // Sort by ascending price.
        // And Sort by ascending title.
        
        bookList.sort(
        		
    		(book1, book2) -> {
        
	        	float a = book1.getPrice() - book2.getPrice();
	            
	        	if(a > 0)  {
	                return 1;
	            } else if(a < 0) {
	                return -1;
	            }
	            int b = book1.getTitle().compareTo(book2.getTitle());
	            return b;
	        }
		);
        
        for(Book b: bookList)  {
            System.out.println(b.getPrice() +" : " + b.getTitle());
        }
    }
}