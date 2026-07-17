class PolyComparison {
    void print(String s) {
        System.out.println(s);
    }

    void print(String s, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(s);
        }
    }
}

class SubPrinter extends PolyComparison {
    @Override
    void print(String s) {
        System.out.println("[OVERRIDE] " + s);
    }
}

class PolyComparisonDemo {
    public static void main(String[] args) {
        System.out.println("=== Compile-Time Polymorphism (Overloading) ===");
        PolyComparison base = new PolyComparison();
        base.print("Hello");
        base.print("Hello", 3);

        System.out.println("\n=== Runtime Polymorphism (Overriding) ===");
        PolyComparison ref = new SubPrinter();
        ref.print("Hello from subclass");

        System.out.println("\nOverloading resolves at compile time (method chosen by params).");
        System.out.println("Overriding resolves at runtime (method chosen by object type).");
    }
}
