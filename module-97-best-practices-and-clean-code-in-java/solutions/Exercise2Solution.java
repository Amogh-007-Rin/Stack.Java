import java.util.ArrayList;
import java.util.List;

public class Exercise2Solution {

    private final List<String> tasks;

    public Exercise2Solution() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }

    public boolean hasTask(String task) {
        return tasks.contains(task);
    }

    public int size() {
        return tasks.size();
    }

    public List<String> getTasks() {
        return new ArrayList<>(tasks);
    }

    public static void main(String[] args) {
        Exercise2Solution todo = new Exercise2Solution();
        todo.addTask("Buy groceries");
        todo.addTask("Read Java chapter");
        todo.addTask("Write tests");
        System.out.println("Tasks: " + todo.getTasks());
        System.out.println("Has 'Read Java chapter'? " + todo.hasTask("Read Java chapter"));
        todo.completeTask(1);
        System.out.println("After completing task at index 1: " + todo.getTasks());
    }
}
