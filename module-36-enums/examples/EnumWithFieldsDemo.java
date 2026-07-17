enum Priority {
    LOW(1, "Low priority"),
    MEDIUM(2, "Medium priority"),
    HIGH(3, "High priority"),
    URGENT(4, "Urgent priority");

    private final int level;
    private final String description;

    Priority(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    public boolean isHighPriority() {
        return level >= 3;
    }
}

public class EnumWithFieldsDemo {
    public static void main(String[] args) {
        for (Priority p : Priority.values()) {
            System.out.println(p + " (level=" + p.getLevel() + "): " + p.getDescription() + " - High? " + p.isHighPriority());
        }
    }
}
