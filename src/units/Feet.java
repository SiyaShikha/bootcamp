package units;

public class Feet extends BaseUnit {
    private final double value;

    public Feet(double value) {
        this.value = value;
    }

    @Override
    Centimeter toCentimeters() {
        return new Centimeter(this.value * 30);
    }
}
