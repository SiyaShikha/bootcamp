package units;

import java.util.Objects;

public class Volume {
    private final double baseValue;

    private Volume(double baseValue) {
        this.baseValue = baseValue;
    }

    static Volume createGallon(double value) {
        double baseValue = toMilliLiters(value, 3780);
        return new Volume(baseValue);
    }

    private static double toMilliLiters(double value, double unitValue) {
        return value * unitValue;
    }

    static Volume createLitres(double value){
        double baseValue = toMilliLiters(value, 1000);
        return new Volume(baseValue);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume that = (Volume) o;
        return Double.compare(baseValue, that.baseValue) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(baseValue);
    }
}
