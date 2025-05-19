package units;

public class Inch extends BaseUnit {
    private final double value;

    public Inch(double value) {
        this.value = value;
    }

    @Override
    Centimeter toCentimeters() {
        return new Centimeter(this.value * 2.5);
    }
}
