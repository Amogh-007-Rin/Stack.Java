import java.util.*;
import java.util.stream.Collectors;

record Employee(String name, String department, double salary) {}

public class Exercise4 {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Alice", "Engineering", 120000),
            new Employee("Bob", "Engineering", 95000),
            new Employee("Charlie", "Marketing", 80000),
            new Employee("Diana", "Marketing", 85000),
            new Employee("Eve", "Sales", 90000),
            new Employee("Frank", "Sales", 110000)
        );

        Map<String, String> directory = employees.stream()
            .collect(Collectors.toMap(
                Employee::name,
                e -> String.format("%s - %s ($%.0f)", e.name(), e.department(), e.salary())
            ));
        System.out.println("Directory:");
        directory.values().forEach(System.out::println);

        Map<String, DoubleSummaryStatistics> deptStats = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::department,
                Collectors.summarizingDouble(Employee::salary)
            ));
        System.out.println("\nDepartment stats:");
        deptStats.forEach((dept, stats) ->
            System.out.printf("%s: avg=$%.0f, max=$%.0f, min=$%.0f%n",
                dept, stats.getAverage(), stats.getMax(), stats.getMin())
        );

        Map<String, Optional<Employee>> highestPaid = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::department,
                Collectors.maxBy(Comparator.comparingDouble(Employee::salary))
            ));
        System.out.println("\nHighest paid per department:");
        highestPaid.forEach((dept, empOpt) ->
            empOpt.ifPresent(e ->
                System.out.println(dept + ": " + e.name() + " ($" + e.salary() + ")"))
        );
    }
}
