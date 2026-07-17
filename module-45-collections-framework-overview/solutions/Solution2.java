public class Solution2 {
    public static void main(String[] args) {
        System.out.println("Collection Type Recommendations:");
        System.out.println();
        System.out.println("1. Waiting list for library computers -> Queue");
        System.out.println("   Reason: FIFO order, patrons wait in line.");
        System.out.println();
        System.out.println("2. Unique set of ISBN numbers -> Set");
        System.out.println("   Reason: No duplicates allowed, order not important.");
        System.out.println();
        System.out.println("3. Student ID -> borrowed book count -> Map");
        System.out.println("   Reason: Key-value mapping from student ID to count.");
        System.out.println();
        System.out.println("4. Daily visitors in arrival order -> List");
        System.out.println("   Reason: Ordered, allows duplicates (same person multiple days).");
    }
}
