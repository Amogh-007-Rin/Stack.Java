// This example demonstrates Spring concepts but requires Maven/Gradle
// and Spring Boot dependencies to compile and run.

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@RequestMapping("/api/items")
public class SimpleRestController {

    private final List<Item> items = new CopyOnWriteArrayList<>();

    public SimpleRestController() {
        items.add(new Item(1, "Laptop", 999.99));
        items.add(new Item(2, "Mouse", 19.99));
    }

    @GetMapping
    public List<Item> getAllItems() {
        return items;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> getItem(@PathVariable int id) {
        return items.stream()
                .filter(item -> item.id() == id)
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Item createItem(@RequestBody Item item) {
        int newId = items.stream().mapToInt(Item::id).max().orElse(0) + 1;
        Item created = new Item(newId, item.name(), item.price());
        items.add(created);
        return created;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteItem(@PathVariable int id) {
        items.removeIf(item -> item.id() == id);
    }
}

record Item(int id, String name, double price) {
}
