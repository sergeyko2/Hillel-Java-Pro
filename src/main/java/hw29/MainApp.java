package hw29;

import java.sql.SQLException;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        OrderDao orderDao = new OrderDao();

        orderDao.addOrderToCustomer(11111, "2023-04-02",
                "2023-04-16", "In Process", 103);
        System.out.println("\nAn order has just been added: \n" + orderDao.findOrderById(11111));

        orderDao.updateOrder(11111, "On Hold", "New comment");
        System.out.println("\nChange order: \n" + orderDao.findOrderById(11111));

        orderDao.deleteOrder(11111);
        System.out.println("\nAfter delete order: \n" + orderDao.findOrderById(11111));
    }
}
