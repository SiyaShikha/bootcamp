import org.junit.jupiter.api.Test;
import shapes.Rectangle;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void calculatesArea() {
        Rectangle rectangle = new Rectangle(2, 4);
        assertEquals(8, rectangle.area());
    }

    @Test
    void calculatesAreaWithZeroLength() {
        Rectangle rectangle = new Rectangle(0, 4);
        assertEquals(0, rectangle.area());
    }

    @Test
    void calculatesAreaWithZeroWidth() {
        Rectangle rectangle = new Rectangle(2, 0);
        assertEquals(0, rectangle.area());
    }

    @Test
    void calculatesPerimeter() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(10, rectangle.perimeter());
    }

    @Test
    void calculatesPerimeterWithZeroLength() {
        Rectangle rectangle = new Rectangle(0, 3);
        assertEquals(6, rectangle.perimeter());
    }

    @Test
    void calculatesPerimeterWithZeroWidth() {
        Rectangle rectangle = new Rectangle(2, 0);
        assertEquals(4, rectangle.perimeter());
    }
}