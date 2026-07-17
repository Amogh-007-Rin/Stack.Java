// This example demonstrates Spring concepts but requires Maven/Gradle
// and Spring Boot dependencies to compile and run.

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class Exercise03CustomerController {

    private final Exercise02CustomerRepository repository;

    public Exercise03CustomerController(Exercise02CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Exercise01CustomerEntity> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Exercise01CustomerEntity> getById(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Exercise01CustomerEntity create(@RequestBody Exercise01CustomerEntity customer) {
        return repository.save(customer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Exercise01CustomerEntity> update(@PathVariable Long id,
                                                            @RequestBody Exercise01CustomerEntity update) {
        return repository.findById(id)
                .map(existing -> {
                    existing.setName(update.getName());
                    existing.setEmail(update.getEmail());
                    existing.setSignupDate(update.getSignupDate());
                    return ResponseEntity.ok(repository.save(existing));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @GetMapping("/search")
    public ResponseEntity<Exercise01CustomerEntity> searchByEmail(@RequestParam String email) {
        return repository.findByEmail(email)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
