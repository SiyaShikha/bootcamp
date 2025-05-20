package units;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void compareGallonsAndLitres() {
        Volume oneGallon = Volume.createGallon(1);
        Volume threeAndHalfLitres = Volume.createLitres(3.78);

        Volume twoGallon = Volume.createGallon(2);

        assert (oneGallon.equals(threeAndHalfLitres));
        assertFalse(twoGallon.equals(threeAndHalfLitres));
    }
}