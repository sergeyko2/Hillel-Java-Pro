package hw20.strategy;

public class MainApp {
    public static void main(String[] args) {

        FigureAreaStrategy figureAreaStrategy;

        figureAreaStrategy = new FigureAreaStrategy(new RectangleArea());
        System.out.println(figureAreaStrategy.calculateAreaStrategy(5.85, 25.47));

        figureAreaStrategy = new FigureAreaStrategy(new TriangleArea());
        System.out.println(figureAreaStrategy.calculateAreaStrategy(5.85, 25.47));
    }
}
