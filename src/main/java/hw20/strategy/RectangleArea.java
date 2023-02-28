package hw20.strategy;

public class RectangleArea implements FigureArea {

    public double calculateArea(double width, double height) {
        System.out.print("Rectangle area = ");
        return width * height;
    }
}
