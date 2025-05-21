package units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DimensionsTest {
    @Test
    void compareInchAndFeet() {
        Measurement twelveInch = Measurement.createInch(12);
        Measurement oneFeet = Measurement.createFeet(1);
        Measurement twoFeet = Measurement.createFeet(2);

        assert (twelveInch.equals(oneFeet));
        assertFalse (twelveInch.equals(twoFeet));
    }

    @Test
    void compareInchAndCentimeter() {
        Measurement twoInch = Measurement.createInch(2);
        Measurement threeInch = Measurement.createInch(3);
        Measurement fiveCentimeter = Measurement.createCentimeter(5);

        assert (twoInch.equals(fiveCentimeter));
        assertFalse (threeInch.equals(fiveCentimeter));
    }

    @Test
    void compareCentimeterAndMillimeter() {
        Measurement oneCentimeter = Measurement.createCentimeter(1);
        Measurement twoCentimeter = Measurement.createCentimeter(2);
        Measurement tenMillimeter = Measurement.createMillimeter(10);

        assert (oneCentimeter.equals(tenMillimeter));
        assertFalse(twoCentimeter.equals(tenMillimeter));
    }

    @Test
    void compareInchAndMillimeter() {
        Measurement oneInch = Measurement.createInch(1);
        Measurement twentyFiveMillimeter = Measurement.createMillimeter(25);
        assert (oneInch.equals(twentyFiveMillimeter));
    }

    @Test
    void addInches() {
        Measurement oneInch = Measurement.createInch(1);
        Measurement twoInch = Measurement.createInch(2);
        Measurement sum = oneInch.add(oneInch);

        assert (sum.equals(Measurement.createInch(2)));
        assertFalse (oneInch.add(twoInch).equals(Measurement.createInch(2)));
    }

    @Test
    void addInchesToCentimeters() {
        Measurement oneInch = Measurement.createInch(1);
        Measurement twoAndHalfCentimeters = Measurement.createCentimeter(2.5);
        Measurement sum = oneInch.add(twoAndHalfCentimeters);

        assert (sum.equals(Measurement.createInch(2)));
    }
}