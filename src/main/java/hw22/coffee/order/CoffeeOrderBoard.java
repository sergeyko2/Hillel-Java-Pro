package hw22.coffee.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private static final Logger log = LoggerFactory.getLogger(CoffeeOrderBoard.class);
    private List<Order> queueOrder = new ArrayList<>();
    private int totalNumber = 1;

    public void deliver() {
        if (queueOrder.isEmpty()) {
            log.trace("Empty list orders");
            return;
        }
        Order currentOrder = queueOrder.get(0);
        log.trace("Current order for delivery: {}", currentOrder);
        log.trace("Order {} for {} is now issued",
                currentOrder.getNumber(), currentOrder.getClient());
        queueOrder.remove(0);
        log.trace("Completed order `{}' has been successfully deleted", currentOrder);
    }

    public void deliver(int number) {
        queueOrder.stream()
                .filter(order -> order.getNumber() == number)
                .forEach(order -> log.trace("Order {} for {} is now issued ", order.getNumber(), order.getClient()));
        if (!queueOrder.removeIf(order -> order.getNumber() == number)) {
            log.trace("Wrong remove order with number: {}", number);
        }
        log.trace("Completed order by number `{}` has been successfully deleted", number);
    }

    public void add(Order order) {
        log.trace("Start method ADD new order:{}", order.getClient());
        order.setNumber(totalNumber++);
        queueOrder.add(order);
        log.trace("Order added successfully: {}", order);
        log.trace("NEW Order {} for {}", order.getNumber(), order.getClient());
        log.trace("End method ADD new order: {}", order);
    }

    public void draw() {
        log.trace("Start method DRAW all orders");
        for (Order order : queueOrder) {
            log.trace(order.toString());
        }
        log.trace("End method DRAW all orders");
    }
}
