import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import shapes.Square;

public class SquareTest {
    @Test
    void calculatesArea() {
        Square square = new Square(4);
        assertEquals(16, square.area());
    }

    @Test
    void calculatesPerimeter() {
        Square square = new Square(4);
        assertEquals(16, square.perimeter());
    }

    @Test
    void calculatesAreaWithZeroSide() {
        Square square = new Square(0);
        assertEquals(0, square.area());
    }

    @Test
    void calculatesPerimeterWithZeroSide() {
        Square square = new Square(0);
        assertEquals(0, square.perimeter());
    }
}
