import org.junit.jupiter.api.Test;
import shapes.Rectangle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void rectArea() {
        Rectangle rectangle = new Rectangle(2, 4);
        assertEquals(8, rectangle.area());
    }

    @Test
    void rectAreaWithZeroLength() {
        Rectangle rectangle = new Rectangle(0, 4);
        assertEquals(0, rectangle.area());
    }

    @Test
    void rectAreaWithZeroWidth() {
        Rectangle rectangle = new Rectangle(2, 0);
        assertEquals(0, rectangle.area());
    }

    @Test
    void rectPerimeter() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(10, rectangle.perimeter());
    }

    @Test
    void rectPerimeterWithZeroLength() {
        Rectangle rectangle = new Rectangle(0, 3);
        assertEquals(6, rectangle.perimeter());
    }

    @Test
    void rectPerimeterWithZeroWidth() {
        Rectangle rectangle = new Rectangle(2, 0);
        assertEquals(4, rectangle.perimeter());
    }
}