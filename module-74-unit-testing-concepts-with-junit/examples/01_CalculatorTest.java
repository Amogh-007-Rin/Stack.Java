import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }
}

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void addReturnsSum() {
        int result = calc.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void addHandlesNegativeNumbers() {
        assertEquals(-1, calc.add(2, -3));
    }

    @Test
    void divideThrowsOnZero() {
        assertThrows(IllegalArgumentException.class,
                () -> calc.divide(10, 0));
    }
}
