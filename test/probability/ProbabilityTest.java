package probability;

import exceptions.InvalidProbabilityException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void probabilityOfGettingTails() throws InvalidProbabilityException {
        Probability probability = Probability.create(0.5);
        assert (probability.equals(Probability.create(0.5)));
    }

    @Test
    void probabilityOfNotGettingTails() throws InvalidProbabilityException {
        Probability probability = Probability.create(0.5);
        assert (probability.complement().equals(Probability.create(0.5)));
    }

    @Test
    void probabilityOfGettingTwoTails() throws InvalidProbabilityException {
        Probability probability = Probability.create(0.25);
        assert (probability.equals(Probability.create(0.25)));
    }

    @Test
    void probabilityOfNotGettingTwoTails() throws InvalidProbabilityException {
        Probability chanceOfFirstCoinGetsTail = Probability.create(0.5);
        Probability chanceOfSecondCoinGetsTail = Probability.create(0.5);

        assert (chanceOfFirstCoinGetsTail.and(chanceOfSecondCoinGetsTail).equals(Probability.create(0.25)));
    }

    @Test
    void throwsWhenProbabilityOutOfRange() {
        assertThrows(Throwable.class, () -> Probability.create(10));

        Throwable error = assertThrows(Throwable.class, () -> Probability.create(-10));
        assertEquals("Invalid Probability", error.getMessage());
    }

    @Test
    void probabilityOfGettingAtLeastOneTails() throws InvalidProbabilityException {
        Probability chanceOfFirstCoinGetsTail = Probability.create(0.5);
        Probability chanceOfSecondCoinGetsTail = Probability.create(0.5);

        assert (chanceOfFirstCoinGetsTail.or(chanceOfSecondCoinGetsTail).equals(Probability.create(0.75)));
    }
}