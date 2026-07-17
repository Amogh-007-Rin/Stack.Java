public class CommandGreeting {
    public static void main(String[] args) {
        String name;
        if (args.length > 0) {
            name = args[0];
        } else {
            name = "stranger";
        }
        System.out.println("Hello, " + name + "!");
    }
}
