// This example demonstrates Spring concepts but requires Maven/Gradle
// and Spring Boot dependencies to compile and run.

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/demo")
public class RequestParamAndPathVariableDemo {

    // GET /api/demo/search?q=spring&page=1
    @GetMapping("/search")
    public String search(@RequestParam String q,
                         @RequestParam(defaultValue = "0") int page) {
        return "Search query: " + q + ", page: " + page;
    }

    // GET /api/demo/users/42
    @GetMapping("/users/{userId}")
    public String getUser(@PathVariable int userId) {
        return "User ID: " + userId;
    }

    // GET /api/demo/users/42/orders/5
    @GetMapping("/users/{userId}/orders/{orderId}")
    public String getOrder(@PathVariable int userId,
                           @PathVariable int orderId) {
        return "User " + userId + ", Order " + orderId;
    }

    // GET /api/demo/map?name=John&role=admin
    @GetMapping("/map")
    public String multiParams(@RequestParam Map<String, String> params) {
        return "All params: " + params.toString();
    }

    // GET /api/demo/optional?name=hello
    @GetMapping("/optional")
    public String optionalParam(@RequestParam(required = false) String name) {
        return "Name: " + (name != null ? name : "not provided");
    }
}
