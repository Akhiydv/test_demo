import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeApiExample1
 {
    public static void main(String args[])
	{
        // Current Date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        // Current Time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        // Current Date and Time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        // Creating a specific date
        LocalDate specificDate = LocalDate.of(2020, 1, 1);
        System.out.println("Specific Date: " + specificDate);

        // Creating a specific time
        LocalTime specificTime = LocalTime.of(10, 30);
        System.out.println("Specific Time: " + specificTime);

        // Creating a specific date and time
        LocalDateTime specificDateTime = LocalDateTime.of(2020, 1, 1, 10, 30);
        System.out.println("Specific Date and Time: " + specificDateTime);

        // Formatting Date
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = currentDate.format(dateFormatter);
        System.out.println("Formatted Date: " + formattedDate);

        // Formatting Time
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(timeFormatter);
        System.out.println("Formatted Time: " + formattedTime);

        // Parsing Date
        String dateString = "25-12-2021";
        LocalDate parsedDate = LocalDate.parse(dateString, dateFormatter);
        System.out.println("Parsed Date: " + parsedDate);

        // Parsing Time
        String timeString = "15:45:30";
        LocalTime parsedTime = LocalTime.parse(timeString, timeFormatter);
        System.out.println("Parsed Time: " + parsedTime);

        // Adding days to a date
        LocalDate dateAfter10Days = currentDate.plusDays(10);
        System.out.println("Date after 10 days: " + dateAfter10Days);

        // Subtracting hours from a time
        LocalTime timeMinus2Hours = currentTime.minusHours(2);
        System.out.println("Time minus 2 hours: " + timeMinus2Hours);

        // Difference between dates
        long daysBetween = ChronoUnit.DAYS.between(specificDate, currentDate);
        System.out.println("Days between " + specificDate + " and " + currentDate + ": " + daysBetween);
    }
}
