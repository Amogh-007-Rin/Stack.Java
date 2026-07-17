import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Exercise1 {
    public static void main(String[] args) {
        String birthdateStr = "1990-05-15";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthdate = LocalDate.parse(birthdateStr, formatter);
        LocalDate today = LocalDate.now();

        Period age = Period.between(birthdate, today);
        System.out.println("Age: " + age.getYears() + " years, "
            + age.getMonths() + " months, " + age.getDays() + " days");

        DayOfWeek dayOfWeek = birthdate.getDayOfWeek();
        System.out.println("Born on: " + dayOfWeek);

        LocalDate thisYearBirthday = birthdate.withYear(today.getYear());
        if (thisYearBirthday.isBefore(today)) {
            System.out.println("Birthday already occurred this year");
        } else if (thisYearBirthday.isEqual(today)) {
            System.out.println("Happy Birthday!");
        } else {
            System.out.println("Birthday is yet to come this year");
        }
    }
}
