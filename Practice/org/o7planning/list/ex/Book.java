package org.o7planning.list.ex;

public class Book {

	private String title;
    private float price;
    
    public Book(String title, float price)  {
        this.title = title;
        this.price = price;
    }
    
    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }  
}