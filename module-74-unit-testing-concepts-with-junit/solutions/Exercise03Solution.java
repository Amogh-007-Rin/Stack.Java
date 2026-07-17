import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Exercise03Solution {

    private List<String> items;

    @BeforeEach
    void setUp() {
        items = new ArrayList<>();
    }

    @Test
    void startsEmpty() {
        assertTrue(items.isEmpty());
    }

    @Test
    void addOneItem() {
        items.add("apple");
        assertEquals(1, items.size());
        assertEquals("apple", items.get(0));
    }

    @Test
    void addAndRemoveItem() {
        items.add("banana");
        items.remove("banana");
        assertTrue(items.isEmpty());
    }

    @Test
    void remainsEmptyAfterEachTest() {
        // This runs after setUp, so items should be a new empty list
        assertTrue(items.isEmpty());
    }
}
