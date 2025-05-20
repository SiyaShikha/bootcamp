package units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DimensionsTest {
    @Test
    void compareInchAndFeet() {
        Dimensions inch = Dimensions.createInch(12);
        Dimensions feet = Dimensions.createFeet(1);
        assert (inch.equals(feet));
    }
}