public class JavapAnalysisDemo {

    public int sumEvenNumbers(int limit) {
        int sum = 0;
        for (int i = 0; i <= limit; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public String repeat(String s, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Compile and run: javap -c JavapAnalysisDemo");
        System.out.println();
        System.out.println("Bytecode instructions to look for:");
        System.out.println("  iload, istore - local variable access");
        System.out.println("  if_icmpgt, if_icmpne - conditionals");
        System.out.println("  goto - loop branching");
        System.out.println("  iconst_0, bipush - constant loading");
        System.out.println("  iadd, idiv - arithmetic");
        System.out.println("  new, invokespecial - object creation");
        System.out.println("  invokevirtual - method calls");
        System.out.println("  ireturn, areturn - return values");
    }
}
