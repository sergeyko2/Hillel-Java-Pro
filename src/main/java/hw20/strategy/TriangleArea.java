package hw20.strategy;

public class TriangleArea implements FigureArea {

    public double calculateArea(double side, double height) {
        System.out.print("Triangle area = ");
        return 0.5 * side * height;
    }
}
