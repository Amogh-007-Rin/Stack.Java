class Parent {
    public Number getValue() {
        return 42;
    }

    protected void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {

    @Override
    public Integer getValue() {
        return 100;
    }

    @Override
    public void show() {
        System.out.println("Child show");
    }
}

public class OverrideRulesDemo {
    public static void main(String[] args) {
        System.out.println("=== Override Rules ===");

        Child c = new Child();
        System.out.println("getValue() returns Integer (covariant): " + c.getValue());

        c.show();

        System.out.println("\nOverride Rules Summary:");
        System.out.println("1. Same signature (name + parameters)");
        System.out.println("2. Covariant return type (Integer is a Number)");
        System.out.println("3. Cannot reduce visibility (public stays public)");
        System.out.println("4. Use @Override annotation");

        System.out.println("\nIf I tried:");
        System.out.println("  private void show() { }  // Would not compile");
        System.out.println("  String getValue() { }    // Would not compile (not covariant)");
    }
}
