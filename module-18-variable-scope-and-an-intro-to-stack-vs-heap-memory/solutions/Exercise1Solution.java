public class Exercise1Solution {

    static int classVar = 1;

    public static void testScope(int param) {
        int localVar = 2;

        System.out.println("classVar: " + classVar);
        System.out.println("param: " + param);
        System.out.println("localVar: " + localVar);

        if (true) {
            int blockVar = 3;
            System.out.println("blockVar: " + blockVar);
        }
    }

    public static void main(String[] args) {
        testScope(99);
    }
}
