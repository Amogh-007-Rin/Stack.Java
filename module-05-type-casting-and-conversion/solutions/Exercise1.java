public class Exercise1 {
    public static void main(String[] args) {
        int i = 1000;
        long l = i;                // implicit widening
        float f = i;               // implicit widening
        double d = i;              // implicit widening
        byte b = (byte) i;         // explicit narrowing
        short s = (short) i;       // explicit narrowing

        System.out.println("int:    " + i);
        System.out.println("long:   " + l + " (implicit)");
        System.out.println("float:  " + f + " (implicit)");
        System.out.println("double: " + d + " (implicit)");
        System.out.println("byte:   " + b + " (explicit cast)");
        System.out.println("short:  " + s + " (explicit cast)");
    }
}
