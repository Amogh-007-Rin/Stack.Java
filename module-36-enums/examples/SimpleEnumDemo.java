enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class SimpleEnumDemo {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;
        System.out.println("Today: " + today);
        System.out.println("Ordinal: " + today.ordinal());

        System.out.println("\nAll days:");
        for (Day d : Day.values()) {
            System.out.println(d.ordinal() + ": " + d);
        }
    }
}
