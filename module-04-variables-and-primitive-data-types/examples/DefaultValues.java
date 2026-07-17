public class DefaultValues {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;

    public static void main(String[] args) {
        DefaultValues dv = new DefaultValues();
        System.out.println("byte:    [" + dv.b + "]");
        System.out.println("short:   [" + dv.s + "]");
        System.out.println("int:     [" + dv.i + "]");
        System.out.println("long:    [" + dv.l + "]");
        System.out.println("float:   [" + dv.f + "]");
        System.out.println("double:  [" + dv.d + "]");
        System.out.println("char:    [" + dv.c + "]");
        System.out.println("boolean: [" + dv.bool + "]");
    }
}
