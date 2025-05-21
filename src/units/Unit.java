package units;

public enum Unit {
    CENTIMETER(0.4), MILLIMETER(0.04), FEET(12), GALLON(3.78);

    private final double unitValue;

    Unit(double unitValue) {
        this.unitValue = unitValue;
    }

    public double convert(double value) {
        return unitValue * value;
    }
}
