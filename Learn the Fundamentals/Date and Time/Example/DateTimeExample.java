package Example;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeExample {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        // Get the current date only
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        // Get the current time only
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        // Format the current date and time using a custom pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);

        // Parse a date string into a LocalDate object
        String dateString = "2024-12-31";
        LocalDate parsedDate = LocalDate.parse(dateString);
        System.out.println("Parsed Date: " + parsedDate);

        // Add 5 days to the current date
        LocalDate futureDate = currentDate.plusDays(5);
        System.out.println("Date After 5 Days: " + futureDate);

        // Subtract 2 hours from the current time
        LocalTime pastTime = currentTime.minusHours(2);
        System.out.println("Time 2 Hours Ago: " + pastTime);

        // Calculate the difference between two dates
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 12, 31);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("Days Between " + startDate + " and " + endDate + ": " + daysBetween);

        // Get the day of the week for a specific date
        DayOfWeek dayOfWeek = parsedDate.getDayOfWeek();
        System.out.println("Day of the Week for " + parsedDate + ": " + dayOfWeek);

        // Check if a year is a leap year
        boolean isLeapYear = currentDate.isLeapYear();
        System.out.println("Is " + currentDate.getYear() + " a leap year? " + isLeapYear);
    }
}
