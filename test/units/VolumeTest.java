package units;
import org.junit.jupiter.api.Test;

class VolumeTest {
    @Test
    void compareGallonsAndLitres() {
        Volume gallon = Volume.createGallon(1);
        Volume litres = Volume.createLitres(3.78);
        assert (gallon.equals(litres));
    }
}