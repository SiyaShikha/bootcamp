package units;

import java.util.Objects;

public class Dimensions {
    private final double value;

    private Dimensions(double baseValue) {
        this.value = baseValue;
    }

    static Dimensions createInch(double value) {
        double baseValue = value * 2.5;
        return new Dimensions(baseValue);
    }

    static Dimensions createFeet(double value) {
        double baseValue = value * 30;
        return new Dimensions(baseValue);
    }

    static Dimensions createCentimeter(double value) {
        return new Dimensions(value);
    }

    static Dimensions millimeter(double value) {
        double baseValue = value / 10;
        return new Dimensions(baseValue);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dimensions that = (Dimensions) o;
        return Double.compare(value, that.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
