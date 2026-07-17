import java.util.Comparator;
import java.util.List;

public class StreamPipeline {
    public static void main(String[] args) {
        // Parse CSV-like data, filter, transform, sort, collect
        String data = """
            Alice,85
            Bob,72
            Charlie,90
            Diana,68
            Eve,95
        """.strip();

        List<String> topStudents = data.lines()
            .map(line -> line.split(","))
            .filter(parts -> parts.length == 2)
            .map(parts -> new Student(parts[0].strip(), Integer.parseInt(parts[1].strip())))
            .filter(s -> s.score >= 75)
            .sorted(Comparator.comparingInt((Student s) -> s.score).reversed())
            .limit(3)
            .map(s -> s.name + " (" + s.score + ")")
            .toList();

        System.out.println("Top 3 students (score >= 75):");
        topStudents.forEach(System.out::println);
    }

    record Student(String name, int score) {}
}
