package hw20.strategy;

public class FigureAreaStrategy {

    private FigureArea figureStrategy;

    public FigureAreaStrategy(FigureArea figureArea) {
        this.figureStrategy = figureArea;
    }

    public double calculateAreaStrategy(double a, double b) {
        return figureStrategy.calculateArea(a, b);
    }
}
