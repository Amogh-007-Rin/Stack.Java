public class ValidationDemo {
    public static void main(String[] args) {
        Derived d = new Derived();
        System.out.println("calculate(5): " + d.calculate(5));
        d.process();

        System.out.println("\n=== Override Rules ===");
        System.out.println("✓ Same signature: calculate(int) matches");
        System.out.println("✓ Covariant return: Integer is-a Number is-a Object");
        System.out.println("✓ Widened visibility: protected → public is allowed");
        System.out.println();
        System.out.println("Would NOT compile:");
        System.out.println("  private void process()     → reduces visibility");
        System.out.println("  int calculate(double x)   → different signature (overload, not override)");
        System.out.println("  String calculate(int x)    → not covariant (String is not a Number)");
    }
}
