package hw4.task0;

public class Triangle implements Figure {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Heron's formula
    //https://en.wikipedia.org/wiki/Heron%27s_formula
    @Override
    public double area() {
        double halfPerimeter;
        halfPerimeter = (a + b + c)/2;
        return Math.pow(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c), 0.5);
    }
}
