public class PassByValueDemo {

    public static void changePrimitive(int x) {
        x = 99;
    }

    public static void changeReference(StringBuilder sb) {
        sb.append(" World");
    }

    public static void reassignReference(StringBuilder sb) {
        sb = new StringBuilder("New Object");
    }

    public static void main(String[] args) {
        int num = 10;
        changePrimitive(num);
        System.out.println("num after changePrimitive: " + num);

        StringBuilder builder = new StringBuilder("Hello");
        changeReference(builder);
        System.out.println("builder after changeReference: " + builder);

        reassignReference(builder);
        System.out.println("builder after reassignReference: " + builder);
    }
}
