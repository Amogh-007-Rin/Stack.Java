import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LifecycleTest {

    @BeforeAll
    static void setupAll() {
        System.out.println("@BeforeAll — runs once before all tests");
    }

    @BeforeEach
    void setup() {
        System.out.println("  @BeforeEach — runs before each test");
    }

    @Test
    void testOne() {
        System.out.println("    @Test one");
    }

    @Test
    void testTwo() {
        System.out.println("    @Test two");
    }

    @AfterEach
    void tearDown() {
        System.out.println("  @AfterEach — runs after each test");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("@AfterAll — runs once after all tests");
    }
}
