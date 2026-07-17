import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class Exercise2 {
    public static void main(String[] args) {
        LocalDate nextMonth = LocalDate.now().plusMonths(1);
        LocalDate thirdFriday = nextMonth.with(TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.FRIDAY));
        LocalDateTime meetingLocal = LocalDateTime.of(thirdFriday, LocalTime.of(14, 0));

        ZonedDateTime meetingNY = meetingLocal.atZone(ZoneId.of("America/New_York"));
        ZonedDateTime meetingLA = meetingNY.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
        ZonedDateTime meetingTokyo = meetingNY.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

        System.out.println("Meeting (NY): " + meetingNY);
        System.out.println("Meeting (LA): " + meetingLA);
        System.out.println("Meeting (Tokyo): " + meetingTokyo);

        ZonedDateTime now = ZonedDateTime.now();
        Duration untilMeeting = Duration.between(now, meetingNY);

        long days = untilMeeting.toDays();
        long hours = untilMeeting.toHoursPart();
        long minutes = untilMeeting.toMinutesPart();

        System.out.printf("Meeting is in %d days, %d hours, %d minutes%n", days, hours, minutes);
    }
}
