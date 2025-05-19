package units;

public class Millimeter extends BaseUnit {
    private final double value;

    public Millimeter(double value) {
        this.value = value;
    }


    @Override
    Centimeter toCentimeters() {
        return new Centimeter(this.value / 10);
    }
}
