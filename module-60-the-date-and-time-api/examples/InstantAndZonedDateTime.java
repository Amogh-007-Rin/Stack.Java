import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantAndZonedDateTime {
    public static void main(String[] args) {
        // Instant — UTC timestamp
        Instant now = Instant.now();
        System.out.println("Instant now (UTC): " + now);

        // ZonedDateTime — with timezone
        ZonedDateTime here = ZonedDateTime.now();
        System.out.println("Here: " + here);

        ZonedDateTime inNewYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("New York: " + inNewYork);

        ZonedDateTime inTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Tokyo: " + inTokyo);

        // Convert between timezones
        ZonedDateTime meetingNY = ZonedDateTime.of(
            LocalDateTime.of(2025, 3, 15, 10, 0),
            ZoneId.of("America/New_York")
        );
        ZonedDateTime meetingTokyo = meetingNY.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println("\nMeeting at 10AM NY = " + meetingTokyo + " Tokyo");

        // Instant from ZonedDateTime
        Instant instant = meetingNY.toInstant();
        System.out.println("Same instant in UTC: " + instant);

        // Convert back
        ZonedDateTime backToNY = instant.atZone(ZoneId.of("America/New_York"));
        System.out.println("Back to NY: " + backToNY);

        // Available zone IDs (just a sample)
        System.out.println("\nSample zone IDs:");
        ZoneId.getAvailableZoneIds().stream()
            .filter(id -> id.contains("Europe"))
            .sorted()
            .limit(5)
            .forEach(System.out::println);
    }
}
