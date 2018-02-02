package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void convertCelsiusToKelvin() {
        TemperatureConverter celsiusToKelvin = new TemperatureConverter("C", "K");
        assertEquals(273.15, celsiusToKelvin.convert(0));
    }

    @Test
    void convertCelsiusToFahrenheit() {
        TemperatureConverter celsiusToFahrenheit = new TemperatureConverter("C", "F");
        assertEquals(32, celsiusToFahrenheit.convert(0));
    }

    @Test
    void convertFahrenheitToCelsius() {
        TemperatureConverter fahrenheitToCelcius = new TemperatureConverter("F", "C");
        assertEquals(0, fahrenheitToCelcius.convert(32));
    }

    @Test
    void covertFahrenheitToKelvin () {
        TemperatureConverter fahrenheitToKelvin = new TemperatureConverter("F", "K");
        assertEquals(255.37, fahrenheitToKelvin.convert(0), 0.1);
    }
}
