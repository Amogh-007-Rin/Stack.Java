import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TemperatureConverter {
    double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}

class Exercise01Solution {

    private final TemperatureConverter converter = new TemperatureConverter();

    @Test
    void celsiusFreezingToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.001);
    }

    @Test
    void celsiusBoilingToFahrenheit() {
        assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.001);
    }

    @Test
    void celsiusNegativeFortyToFahrenheit() {
        assertEquals(-40.0, converter.celsiusToFahrenheit(-40), 0.001);
    }

    @Test
    void fahrenheitFreezingToCelsius() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.001);
    }

    @Test
    void fahrenheitBoilingToCelsius() {
        assertEquals(100.0, converter.fahrenheitToCelsius(212), 0.001);
    }

    @Test
    void fahrenheitNegativeFortyToCelsius() {
        assertEquals(-40.0, converter.fahrenheitToCelsius(-40), 0.001);
    }
}
