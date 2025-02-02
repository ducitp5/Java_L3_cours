package Partie1;

import java.util.Date;

public class DateExample {
    @SuppressWarnings({ "deprecation" })
	public static void main(String[] args) {
        // Create a Date object representing the current date and time
        Date currentDate = new Date();
        System.out.println("Current Date: " + currentDate.toString());

        Date specificDate = new Date(125, 0, 31, 15, 52, 41); // October 15, 2021
        System.out.println("Specific Date 2: " + specificDate);
        System.out.println("Specific Date 2: " + specificDate.toLocaleString());

     // Deprecated: Avoid using this constructor
        Date deprecatedDateFromString = new Date("january 31, 2025");
        System.out.println(deprecatedDateFromString);
        
        // Compare two dates
        if (currentDate.after(specificDate)) {
            System.out.println("Current date is after the specific date.");
        } else if (currentDate.before(specificDate)) {
            System.out.println("Current date is before the specific date.");
        } else {
            System.out.println("Both dates are the same.");
        }

        // Get the time in milliseconds since January 1, 1970, 00:00:00 GMT
        long timeInMillis = currentDate.getTime();
        System.out.println("Time in milliseconds: " + timeInMillis);
        System.out.println("Time in milliseconds: " + timeInMillis);
    }
}