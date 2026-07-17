import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class StringHelper {
    static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    static int length(String s) {
        return s == null ? 0 : s.length();
    }
}

class ParameterizedTestDemo {

    @ParameterizedTest
    @ValueSource(strings = {"racecar", "radar", "level", "madam"})
    void palindromesAreDetected(String candidate) {
        assertTrue(StringHelper.isPalindrome(candidate));
    }

    @ParameterizedTest
    @CsvSource({
        "hello, 5",
        "Java, 4",
        "'', 0",
        "a, 1"
    })
    void stringLengths(String input, int expected) {
        assertEquals(expected, StringHelper.length(input));
    }
}
