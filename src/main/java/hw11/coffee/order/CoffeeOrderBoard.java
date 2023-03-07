package hw11.coffee.order;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private List<Order> orderList = new ArrayList<>();
    private int totalNumber = 1;

    public void deliver() {
        if (orderList.isEmpty()) {
            System.out.println("No order!");
            return;
        }
        Order currentOrder = orderList.get(0);
        System.out.printf("Order #%d for %s is now issued",
                currentOrder.getNumber(), currentOrder.getClient());
        System.out.println();
        orderList.remove(0);
    }

    public void deliver(int number) {
        for (Order order : orderList) {
            if (order.getNumber() == number) {
                System.out.printf("Order #%d for %s is now issued",
                        order.getNumber(), order.getClient());
                System.out.println();
                orderList.remove(order);
                return;
            }
        }
    }

    public void add(Order order) {
        order.setNumber(totalNumber++);
        orderList.add(order);
        System.out.printf("NEW Order #%d for %s",
                order.getNumber(), order.getClient());
        System.out.println();
    }

    public void draw() {
        for (Order order : orderList) {
            System.out.println(order);
        }
    }
}
