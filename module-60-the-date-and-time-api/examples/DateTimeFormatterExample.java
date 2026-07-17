import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        // Predefined formatters
        System.out.println("ISO_LOCAL_DATE: " + now.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("ISO_LOCAL_DATE_TIME: " + now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        // Localized formatters
        System.out.println("MEDIUM: " + now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
        System.out.println("SHORT: " + now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));

        // Custom patterns
        DateTimeFormatter custom = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Custom: " + now.format(custom));

        DateTimeFormatter european = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("European: " + now.format(european));

        DateTimeFormatter full = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy 'at' h:mm a");
        System.out.println("Full: " + now.format(full));

        // Parsing
        String dateStr = "2025-03-15";
        LocalDate parsed = LocalDate.parse(dateStr);  // ISO format
        System.out.println("Parsed ISO date: " + parsed);

        String customStr = "15/03/2025";
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parsedCustom = LocalDate.parse(customStr, parser);
        System.out.println("Parsed custom: " + parsedCustom);

        // Thread-safety note
        System.out.println("\nDateTimeFormatter is thread-safe (unlike SimpleDateFormat)");
    }
}
