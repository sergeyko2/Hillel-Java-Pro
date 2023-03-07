package hw11.coffee.order;

public class MainApp {
    public static void main(String[] args) {
        CoffeeOrderBoard board = new CoffeeOrderBoard();

        board.add(new Order("Serhii"));
        board.add(new Order("Iryna"));
        board.add(new Order("Alex"));
        board.add(new Order("Maxim"));
        board.add(new Order("Mykola"));
        board.add(new Order("Yaroslav"));

        board.draw();

        board.deliver();
        board.deliver(4);
        board.deliver();

        board.draw();
    }
}
