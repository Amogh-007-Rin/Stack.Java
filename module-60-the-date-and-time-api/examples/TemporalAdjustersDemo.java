import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        // First day of month
        LocalDate firstDay = today.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("First day of month: " + firstDay);

        // Last day of month
        LocalDate lastDay = today.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Last day of month: " + lastDay);

        // Next Monday
        LocalDate nextMonday = today.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println("Next Monday: " + nextMonday);

        // Previous Friday
        LocalDate prevFriday = today.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
        System.out.println("Previous Friday: " + prevFriday);

        // First Monday of the month
        LocalDate firstMonday = today.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println("First Monday of month: " + firstMonday);

        // Last Friday of the month
        LocalDate lastFriday = today.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));
        System.out.println("Last Friday of month: " + lastFriday);

        // Next or same Wednesday
        LocalDate nextOrSameWed = today.with(TemporalAdjusters.nextOrSame(DayOfWeek.WEDNESDAY));
        System.out.println("Next or same Wednesday: " + nextOrSameWed);

        // Day of week in month (e.g., 3rd Tuesday)
        LocalDate thirdTuesday = today.with(TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.TUESDAY));
        System.out.println("3rd Tuesday of month: " + thirdTuesday);
    }
}
