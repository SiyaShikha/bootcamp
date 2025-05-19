package units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest {
    @Test
    void compareInchAndFeet() {
        Inch inch = new Inch(12);
        Feet feet = new Feet(1);
        assert (inch.toCentimeters().equals(feet.toCentimeters()));
    }

    @Test
    void compareInchAndCentimeter() {
        Inch inch = new Inch(2);
        assert (inch.toCentimeters().equals(new Centimeter(5)));
    }

    @Test
    void compareCentimeterAndMillimeter() {
        Millimeter millimeter = new Millimeter(10);
        assert (millimeter.toCentimeters().equals(new Centimeter(1)));
    }
}