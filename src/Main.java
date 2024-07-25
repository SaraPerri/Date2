import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int year = dateTime.getYear();
        Month month = dateTime.getMonth();
        int day = dateTime.getDayOfMonth();
        DayOfWeek dayW = dateTime.getDayOfWeek();
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Day of week: " + dayW);

    }
}