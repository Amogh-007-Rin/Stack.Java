class RefRect {
    double length;
    double width;
}

public class ReferenceChallenge {
    public static void main(String[] args) {
        int a = 5;
        int b = a;
        b = 10;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Primitives: a and b are independent. Changing b did not affect a.");

        RefRect r1 = new RefRect();
        r1.length = 10;
        r1.width = 5;

        RefRect r2 = r1;
        r2.length = 20;

        System.out.println("r1.length = " + r1.length + ", r2.length = " + r2.length);
        System.out.println("References: r1 and r2 point to the SAME object.");
        System.out.println("Changing r2.length also changes r1.length because both refer to the same Rectangle.");
    }
}
