package pl.michalpolom;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegersMeasurementTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void shouldReturnMeasurement_simpleExample() {

        IntegersMeasurement.main(new String[]{"1", "2"});

        String output = """
                1 2
                count: 2
                distinct: 2
                min: 1
                max: 2""";

        assertEquals(output, outputStreamCaptor.toString().trim());
    }

    @Test
    void shouldReturnMeasurement_moreComplexExample() {

        IntegersMeasurement.main(new String[]{"0", "-77777", "14", "14", "-11111", "-2147483648", "2147483647"});

        String output = """
                -2147483648 -77777 -11111 0 14 2147483647
                count: 7
                distinct: 6
                min: -2147483648
                max: 2147483647""";

        assertEquals(output, outputStreamCaptor.toString().trim());
    }

    @Test
    void shouldReturnError_whenInputIsNotAListOfNumbers() {
        IntegersMeasurement.main(new String[]{"1", "2", "A", "."});

        String output = "ERROR: At least one of the argument is not an Integer (min=-2147483648, max=2147483647)";

        assertEquals(output, outputStreamCaptor.toString().trim());
    }

}