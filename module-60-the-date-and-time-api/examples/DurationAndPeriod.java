import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DurationAndPeriod {
    public static void main(String[] args) {
        // Duration — machine time (hours, minutes, seconds, nanos)
        Duration twoHours = Duration.ofHours(2);
        Duration thirtyMinutes = Duration.ofMinutes(30);
        Duration total = twoHours.plus(thirtyMinutes);
        System.out.println("Duration: " + total);                // PT2H30M
        System.out.println("Total minutes: " + total.toMinutes());

        // Duration between two times
        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(17, 30);
        Duration workDay = Duration.between(start, end);
        System.out.println("Work day: " + workDay.toHours() + " hours");

        // Period — calendar time (days, months, years)
        Period oneYearSixMonths = Period.of(1, 6, 0);
        System.out.println("Period: " + oneYearSixMonths);      // P1Y6M

        // Period between two dates
        LocalDate birthday = LocalDate.of(1990, 5, 15);
        LocalDate today = LocalDate.now();
        Period age = Period.between(birthday, today);
        System.out.println("Age: " + age.getYears() + " years, "
            + age.getMonths() + " months, " + age.getDays() + " days");

        // Adding duration to LocalDateTime
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime later = now.plus(Duration.ofHours(3).plusMinutes(15));
        System.out.println("Now: " + now);
        System.out.println("+3h15m: " + later);

        // Adding period to LocalDate
        LocalDate nextAppointment = today.plus(Period.ofWeeks(2));
        System.out.println("Next appointment (in 2 weeks): " + nextAppointment);
    }
}
