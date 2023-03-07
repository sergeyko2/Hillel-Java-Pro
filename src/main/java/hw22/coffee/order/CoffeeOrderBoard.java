package hw22.coffee.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private static final Logger log = LoggerFactory.getLogger(CoffeeOrderBoard.class);
    private List<Order> orderList = new ArrayList<>();
    private int totalNumber = 1;

    public void deliver() {
        if (orderList.isEmpty()) {
            System.out.println("No order!");
            log.info("Empty list orders");
            return;
        }
        Order currentOrder = orderList.get(0);
        log.info("Current order for delivery: " + currentOrder);
        System.out.printf("Order #%d for %s is now issued",
                currentOrder.getNumber(), currentOrder.getClient());
        System.out.println();
        orderList.remove(0);
        log.info("Completed order `" + currentOrder + "' has been successfully deleted");
    }

    public void deliver(int number) {
        orderList.stream()
                .filter(order -> order.getNumber() == number)
                .forEach(order -> System.out.printf("Order #%d for %s is now issued\n",
                        order.getNumber(), order.getClient()));
        orderList.removeIf(order -> order.getNumber() == number);
        log.info("Completed order by number `" + number + "` has been successfully deleted");
    }

    public void add(Order order) {
        log.info("Start method ADD new order: " + order.getClient());
        order.setNumber(totalNumber++);
        orderList.add(order);
        log.info("Order added successfully: " + order);
        System.out.printf("NEW Order #%d for %s",
                order.getNumber(), order.getClient());
        System.out.println();
        log.info("End method ADD new order: " + order);
    }

    public void draw() {
        log.info("Start method DRAW all orders");
        for (Order order : orderList) {
            System.out.println(order);
        }
        log.info("End method DRAW all orders");
    }
}
