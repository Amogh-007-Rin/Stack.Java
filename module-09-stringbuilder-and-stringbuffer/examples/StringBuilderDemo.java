public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Start");

        sb.append(" -> middle");
        System.out.println("After append: " + sb);

        sb.insert(0, "Begin -> ");
        System.out.println("After insert: " + sb);

        sb.delete(0, 7);
        System.out.println("After delete(0,7): " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        String result = sb.toString();
        System.out.println("Final string: " + result);
    }
}
