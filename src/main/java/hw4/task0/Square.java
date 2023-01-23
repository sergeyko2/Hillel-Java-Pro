package hw4.task0;

public class Square implements Figure {
    private final double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return Math.pow(width, 2);
    }
}
