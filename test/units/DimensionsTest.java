package units;

import org.junit.jupiter.api.Test;

class DimensionsTest {
    @Test
    void compareInchAndFeet() {
        Dimension inch = Dimension.createInch(12);
        Dimension feet = Dimension.createFeet(1);
        assert (inch.equals(feet));
    }

    @Test
    void compareInchAndCentimeter() {
        Dimension inch = Dimension.createInch(2);
        Dimension centimeter = Dimension.createCentimeter(5);
        assert (inch.equals(centimeter));
    }

    @Test
    void compareCentimeterAndMillimeter() {
        Dimension centimeter = Dimension.createCentimeter(1);
        Dimension millimeter = Dimension.createMillimeter(10);
        assert (centimeter.equals(millimeter));
    }
}