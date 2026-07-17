enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

public class Exercise1Solution {
    public static void main(String[] args) {
        System.out.println("All seasons:");
        for (Season s : Season.values()) {
            System.out.println(s.ordinal() + ": " + s);
        }

        Season current = Season.SUMMER;
        switch (current) {
            case SPRING:
                System.out.println("Flowers bloom");
                break;
            case SUMMER:
                System.out.println("It's hot");
                break;
            case AUTUMN:
                System.out.println("Leaves fall");
                break;
            case WINTER:
                System.out.println("It's cold");
                break;
        }
    }
}
