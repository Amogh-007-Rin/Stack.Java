import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        ArrayDeque<String> undoStack = new ArrayDeque<>();
        undoStack.push("Add book");
        undoStack.push("Remove book");
        undoStack.push("Edit title");
        System.out.println("Stack: " + undoStack);

        String undone1 = undoStack.pop();
        System.out.println("Undone: " + undone1);
        String undone2 = undoStack.pop();
        System.out.println("Undone: " + undone2);

        System.out.println("Remaining: " + undoStack);
    }
}
