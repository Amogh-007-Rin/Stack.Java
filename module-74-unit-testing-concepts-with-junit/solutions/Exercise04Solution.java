import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Exercise04Solution {

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 100, 0, -6, 256, -1024})
    void evenNumbers(int number) {
        assertTrue(isEven(number));
    }
}
