enum TrafficLight {
    RED, YELLOW, GREEN
}

public class EnumSwitchDemo {
    public static void main(String[] args) {
        TrafficLight light = TrafficLight.RED;

        switch (light) {
            case RED:
                System.out.println("Stop");
                break;
            case YELLOW:
                System.out.println("Caution");
                break;
            case GREEN:
                System.out.println("Go");
                break;
        }

        System.out.println("\nAll lights:");
        for (TrafficLight t : TrafficLight.values()) {
            System.out.println(t.ordinal() + ": " + t);
        }
    }
}
