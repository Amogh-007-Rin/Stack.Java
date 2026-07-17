public class WideningCasting {
    public static void main(String[] args) {
        byte b = 42;
        short s = b;        // byte → short
        int i = s;          // short → int
        long l = i;         // int → long
        float f = l;        // long → float
        double d = f;       // float → double

        System.out.println("byte:   " + b);
        System.out.println("short:  " + s);
        System.out.println("int:    " + i);
        System.out.println("long:   " + l);
        System.out.println("float:  " + f);
        System.out.println("double: " + d);

        char c = 'A';
        int ci = c;         // char → int (65)
        System.out.println("char '" + c + "' → int " + ci);
    }
}
