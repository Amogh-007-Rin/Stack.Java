// This example demonstrates Spring concepts but requires Maven/Gradle
// and Spring Boot dependencies to compile and run.

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/api/tasks")
public class Exercise01TaskController {

    private final List<Task> tasks = new CopyOnWriteArrayList<>();
    private final AtomicInteger idGen = new AtomicInteger(1);

    @GetMapping
    public List<Task> getAllTasks() {
        return tasks;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTask(@PathVariable int id) {
        return tasks.stream()
                .filter(t -> t.id() == id)
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Task createTask(@RequestBody TaskRequest request) {
        Task task = new Task(idGen.getAndIncrement(),
                request.title(), request.description(), false);
        tasks.add(task);
        return task;
    }
}

record Task(int id, String title, String description, boolean completed) {
}

record TaskRequest(String title, String description) {
}
