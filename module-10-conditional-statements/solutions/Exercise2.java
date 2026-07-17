public class Exercise2 {
    public static void main(String[] args) {
        int a = 20;
        int b = 5;
        char op = '/';

        switch (op) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Division by zero");
                } else {
                    System.out.println(a + " / " + b + " = " + (a / b));
                }
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Division by zero");
                } else {
                    System.out.println(a + " % " + b + " = " + (a % b));
                }
                break;
            default:
                System.out.println("Unknown operator: " + op);
        }
    }
}
