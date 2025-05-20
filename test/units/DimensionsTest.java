package units;

import org.junit.jupiter.api.Test;

class DimensionsTest {
    @Test
    void compareInchAndFeet() {
        Dimension twelveInch = Dimension.createInch(12);
        Dimension oneFeet = Dimension.createFeet(1);
        assert (twelveInch.equals(oneFeet));
    }

    @Test
    void compareInchAndCentimeter() {
        Dimension twoInch = Dimension.createInch(2);
        Dimension fiveCentimeter = Dimension.createCentimeter(5);
        assert (twoInch.equals(fiveCentimeter));
    }

    @Test
    void compareCentimeterAndMillimeter() {
        Dimension oneCentimeter = Dimension.createCentimeter(1);
        Dimension tenMillimeter = Dimension.createMillimeter(10);
        assert (oneCentimeter.equals(tenMillimeter));
    }

    @Test
    void compareInchAndMillimeter() {
        Dimension oneInch = Dimension.createInch(1);
        Dimension twentyFiveMillimeter = Dimension.createMillimeter(25);
        assert (oneInch.equals(twentyFiveMillimeter));
    }
}