package src;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
		
	public static void run1() {
		
		Calendar calendar = Calendar.getInstance();

        int year 	= calendar.get(Calendar.YEAR);
        int month 	= calendar.get(Calendar.MONTH) + 1; // Months are 0-based
        int day 	= calendar.get(Calendar.DAY_OF_MONTH);
        int hour 	= calendar.get(Calendar.HOUR_OF_DAY);
        int minute 	= calendar.get(Calendar.MINUTE);
        int second 	= calendar.get(Calendar.SECOND);

        System.out.printf("Current Date and Time: %04d-%02d-%02d %02d:%02d:%02d%n", year, month, day, hour, minute, second);

        // Add 5 days to the current date
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("Date after adding 5 days: " + calendar.getTime());

        // Subtract 2 months from the current date
        calendar.add(Calendar.MONTH, -2);
        System.out.println("Date after subtracting 2 months: " + calendar.getTime());

        // Set a specific date
        calendar.set(2023, Calendar.DECEMBER, 25);
        System.out.println("Set Date: " + calendar.getTime());
	}
	
	public static void run2() {
		
		LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and Time: " + now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        LocalDateTime futureDate = now.plusDays(5).minusMonths(2);
        System.out.println("Date after adding 5 days and subtracting 2 months: " + futureDate);
	}
	
	public static void run3() {
		
		 Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Months are zero-based
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("Current Date: " + year + "-" + month + "-" + day);
	}
    
	public static void run4() {
		
		Calendar calendar = Calendar.getInstance();
//        calendar.set(2025, Calendar.DECEMBER, 31);

        Date date = calendar.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Formatted Date: " + sdf.format(date));
	}
	
	public static void run5() {
		
		LocalDate today = LocalDate.now();
        System.out.println(today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
	   
	}
	
	
	public static void main(String[] args) {

		run5();
    }
}