package hw4.task0;

public class MainApp {
    public static void main(String[] args) {
        Figure[] figures = {
                new Circle(23.1),
                new Square(14.6),
                new Triangle(10.2, 14.3, 9.7)};
        System.out.printf("The total area of all figures: %.2f sq.cm", calcTotalArea(figures));
    }

    private static double calcTotalArea(Figure[] figures) {
        double totalArea = 0;
        for (Figure figure : figures) totalArea += figure.area();
        return totalArea;
    }
}
