import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
    public static List<LocalDate> getWeekdaysInRange(LocalDate start, LocalDate end) {
        List<LocalDate> weekdays = new ArrayList<>();
        LocalDate current = start;
        while (!current.isAfter(end)) {
            DayOfWeek dow = current.getDayOfWeek();
            if (dow != DayOfWeek.SATURDAY && dow != DayOfWeek.SUNDAY) {
                weekdays.add(current);
            }
            current = current.plusDays(1);
        }
        return weekdays;
    }

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2025, 3, 1);
        LocalDate end = LocalDate.of(2025, 3, 15);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM d");
        List<LocalDate> weekdays = getWeekdaysInRange(start, end);

        System.out.println("Weekdays from " + start + " to " + end + ":");
        weekdays.forEach(d -> System.out.println(d.format(formatter)));
    }
}
