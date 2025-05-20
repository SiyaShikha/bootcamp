package units;

import java.util.Objects;

public class Dimension {
    private final double baseValue;

    private Dimension(double baseValue) {
        this.baseValue = baseValue;
    }

    static Dimension createInch(double value) {
        double baseValue = toMillimeter(value, 25);
        return new Dimension(baseValue);
    }

    private static double toMillimeter(double value, double unitValue) {
        return value * unitValue;
    }

    static Dimension createFeet(double value) {
        double baseValue = toMillimeter(value, 300);
        return new Dimension(baseValue);
    }

    static Dimension createCentimeter(double value) {
        double baseValue = toMillimeter(value, 10);
        return new Dimension(baseValue);
    }

    static Dimension createMillimeter(double value) {
        return new Dimension(value);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dimension that = (Dimension) o;
        return Double.compare(baseValue, that.baseValue) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(baseValue);
    }

    public Dimension add(Dimension other) {
        return new Dimension(this.baseValue + other.baseValue);
    }
}
