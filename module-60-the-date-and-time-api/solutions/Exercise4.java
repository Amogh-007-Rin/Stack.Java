import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Set;

public class Exercise4 {
    public static LocalDate nextBusinessDay(LocalDate date, Set<LocalDate> holidays) {
        LocalDate next = date.plusDays(1);
        while (isWeekend(next) || holidays.contains(next)) {
            next = next.plusDays(1);
        }
        return next;
    }

    private static boolean isWeekend(LocalDate date) {
        DayOfWeek dow = date.getDayOfWeek();
        return dow == DayOfWeek.SATURDAY || dow == DayOfWeek.SUNDAY;
    }

    public static void main(String[] args) {
        Set<LocalDate> holidays2025 = Set.of(
            LocalDate.of(2025, Month.JANUARY, 1),   // New Year's
            LocalDate.of(2025, Month.JULY, 4),       // Independence Day
            LocalDate.of(2025, Month.DECEMBER, 25),  // Christmas
            LocalDate.of(2025, Month.NOVEMBER, 27)   // Thanksgiving (approx)
        );

        LocalDate[] testDates = {
            LocalDate.of(2025, 12, 24),
            LocalDate.of(2025, 12, 31),
            LocalDate.of(2025, 7, 3),
            LocalDate.of(2025, 1, 1)
        };

        for (LocalDate d : testDates) {
            LocalDate nextBiz = nextBusinessDay(d, holidays2025);
            System.out.println(d + " -> next business day: " + nextBiz + " (" + nextBiz.getDayOfWeek() + ")");
        }
    }
}
