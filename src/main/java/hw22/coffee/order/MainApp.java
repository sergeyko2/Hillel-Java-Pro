package hw22.coffee.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApp {
    private static final Logger log = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) {
        CoffeeOrderBoard board = new CoffeeOrderBoard();

        log.trace("Start board");
        board.add(new Order("Serhii"));
        board.add(new Order("Iryna"));
        board.add(new Order("Alex"));
        board.add(new Order("Maxim"));
        board.add(new Order("Mykola"));
        board.add(new Order("Yaroslav"));
        board.deliver();
        board.deliver(4);
        board.deliver();
        board.add(new Order("Nikita"));
        board.deliver();
        board.deliver(7);
        board.add(new Order("Kseniia"));
        board.draw();

        log.trace("End board");
    }
}
