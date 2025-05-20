package units;

import java.util.Objects;

public class Dimension {
    private final double value;

    private Dimension(double baseValue) {
        this.value = baseValue;
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
        return Double.compare(value, that.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
