public class Exercise2 {
    public static void main(String[] args) {
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 3.14f;
        double d = 3.14;
        char c = 'Z';
        boolean bool = true;

        System.out.println("byte: " + b + " + 1 = " + (byte)(b + 1));
        System.out.println("short: " + s + " + 1 = " + (short)(s + 1));
        System.out.println("int: " + i + " + 1 = " + (i + 1));
        System.out.println("long: " + l + " + 1 = " + (l + 1));
        System.out.println("float: " + f + " + 1 = " + (f + 1));
        System.out.println("double: " + d + " + 1 = " + (d + 1));
        System.out.println("char: " + (int)c + " + 1 = " + (char)(c + 1));
        System.out.println("boolean " + bool);
    }
}
