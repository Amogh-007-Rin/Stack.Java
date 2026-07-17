public class BytecodeDemo {

    public int add(int a, int b) {
        return a + b;
    }

    public int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        BytecodeDemo demo = new BytecodeDemo();

        int sum = demo.add(10, 20);
        System.out.println("Sum: " + sum);

        int fact = demo.factorial(5);
        System.out.println("5! = " + fact);

        String greeting = demo.greet("Java");
        System.out.println(greeting);

        System.out.println("\nRun javap -c BytecodeDemo to see the bytecode");
    }
}
