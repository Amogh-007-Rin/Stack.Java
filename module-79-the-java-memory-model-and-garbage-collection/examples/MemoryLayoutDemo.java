public class MemoryLayoutDemo {

    private static int depth = 0;

    public static void recurse() {
        int localVar = depth++;
        System.out.println("Depth: " + localVar + " - stack frame pushed");

        int[] heapArray = new int[1000];

        try {
            recurse();
        } catch (StackOverflowError e) {
            System.out.println("Stack overflow at depth: " + localVar);
            System.out.println("Each recursive call pushed a new stack frame");
            System.out.println("The array objects are on the heap, references on the stack");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Stack and Heap Demo ===");
        System.out.println("Stack: stores method call frames and local variables");
        System.out.println("Heap: stores objects (arrays, instances)");
        System.out.println();

        recurse();
    }
}
