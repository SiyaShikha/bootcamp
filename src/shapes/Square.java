package shapes;

public class Square implements ClosedShapes {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return this.side * this.side;
    }

    @Override
    public int perimeter() {
        return 4 * this.side;
    }
}
