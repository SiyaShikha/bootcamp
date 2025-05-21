package units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void compareGallonsAndLitres() {
        Measurement oneGallon = Measurement.createGallon(1);
        Measurement threeAndHalfLitres = Measurement.createLitres(3.78);

        Measurement twoGallon = Measurement.createGallon(2);

        assert (oneGallon.equals(threeAndHalfLitres));
        assertFalse(twoGallon.equals(threeAndHalfLitres));
    }

    @Test
    void addsGallonToLitres() {
        Measurement oneGallon = Measurement.createGallon(1);
        Measurement oneLitre = Measurement.createLitres(1);
        assert (oneLitre.add(oneGallon).equals(Measurement.createLitres(4.78)));
    }
}