public class VariableDeclaration {
    static int classField;   // default: 0

    public static void main(String[] args) {
        int localVar;        // declared but NOT initialized
        // System.out.println(localVar);  // compile error

        localVar = 42;       // now initialized
        System.out.println("localVar: " + localVar);

        int declaredAndInit = 100;
        System.out.println("declaredAndInit: " + declaredAndInit);

        System.out.println("classField (default): " + classField);

        char letter = 'Z';
        boolean flag = false;
        System.out.println("letter: " + letter + ", flag: " + flag);
    }
}
