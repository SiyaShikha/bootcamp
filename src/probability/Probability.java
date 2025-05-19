package probability;

import exceptions.InvalidProbabilityException;

import java.util.Objects;

public class Probability {
    private final double probability;

    private Probability(double probability) {
        this.probability = probability;
    }

    public static Probability create(double probability) throws InvalidProbabilityException {
        if(probability>=0 && probability <=1){
            return new Probability(probability);
        }
//        throw new RuntimeException("Incorrect Probability");
        throw new InvalidProbabilityException("Invalid Probability");
    }

    public Probability complement() {
        return new Probability(1 - this.probability);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(probability, that.probability) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(probability);
    }

    public Probability and(Probability probability2) {
        return new Probability(this.probability * probability2.probability);
    }

    public Probability or(Probability probability2) {
        return this.and(probability2).complement();
    }
}
