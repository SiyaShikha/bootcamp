package units;

public enum Unit {
    INCH(1),CENTIMETER(0.4), MILLIMETER(0.04), FEET(12);

    private final double unitValue;

    Unit(double unitValue) {
        this.unitValue = unitValue;
    }

    public double convert(double value) {
        return unitValue * value;
    }
}
