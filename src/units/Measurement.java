package units;

import java.util.Objects;

public class Measurement {
    private final double baseValue;

    private Measurement(double baseValue) {
        this.baseValue = baseValue;
    }

    static Measurement createInch(double value) {
        return new Measurement(value);
    }

    static Measurement createFeet(double value) {
        double baseValue = Unit.FEET.convert(value);
        return new Measurement(baseValue);
    }

    static Measurement createCentimeter(double value) {
        double baseValue = Unit.CENTIMETER.convert(value);
        return new Measurement(baseValue);
    }

    static Measurement createMillimeter(double value) {
        double baseValue = Unit.MILLIMETER.convert(value);
        return new Measurement(baseValue);
    }

    static Measurement createGallon(double value) {
        double baseValue = Unit.GALLON.convert(value);
        return new Measurement(baseValue);
    }

    static Measurement createLitres(double value){
        return new Measurement(value);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Measurement that = (Measurement) o;
        return Double.compare(baseValue, that.baseValue) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(baseValue);
    }

    public Measurement add(Measurement other) {
        return new Measurement(this.baseValue + other.baseValue);
    }
}
