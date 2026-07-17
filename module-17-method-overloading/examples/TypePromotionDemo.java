public class TypePromotionDemo {

    public static void display(int a) {
        System.out.println("int version: " + a);
    }

    public static void display(long a) {
        System.out.println("long version: " + a);
    }

    public static void display(double a) {
        System.out.println("double version: " + a);
    }

    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40L;
        float f = 50.5f;
        double d = 60.5;

        display(b);
        display(s);
        display(i);
        display(l);
        display(f);
        display(d);
    }
}
