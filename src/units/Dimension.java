package units;

import java.util.Objects;

public class Dimension {
    private final double baseValue;

    private Dimension(double baseValue) {
        this.baseValue = baseValue;
    }

    static Dimension createInch(double value) {
        return new Dimension(value);
    }

    static Dimension createFeet(double value) {
        double baseValue = Unit.FEET.convert(value);
        return new Dimension(baseValue);
    }

    static Dimension createCentimeter(double value) {
        double baseValue = Unit.CENTIMETER.convert(value);
        return new Dimension(baseValue);
    }

    static Dimension createMillimeter(double value) {
        double baseValue = Unit.MILLIMETER.convert(value);
        return new Dimension(baseValue);
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
