public class ScopeDemo {

    static int classVar = 100;

    public static void demoScope(int param) {
        int localVar = 50;
        System.out.println("param: " + param);
        System.out.println("localVar: " + localVar);
        System.out.println("classVar: " + classVar);

        if (param > 0) {
            int blockVar = 200;
            System.out.println("blockVar inside if: " + blockVar);
        }

        // System.out.println(blockVar); // compile error — out of scope
    }

    public static void main(String[] args) {
        demoScope(10);
        System.out.println("classVar from main: " + classVar);
    }
}
