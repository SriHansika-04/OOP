package mypackage;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class date_timeAPI {
	 public static void main(String[] args) {
	        // Current date and time
	        LocalDate date = LocalDate.now();
	        LocalTime time = LocalTime.now();
	        LocalDateTime dateTime = LocalDateTime.now();

	        System.out.println("Current Date: " + date);
	        System.out.println("Current Time: " + time);
	        System.out.println("Current Date & Time: " + dateTime);

	        // Custom formatting
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
	        String formattedDateTime = dateTime.format(formatter);
	        System.out.println("Formatted DateTime: " + formattedDateTime);
}
}
