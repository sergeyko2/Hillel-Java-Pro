package hw29;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderDao {

    public Order findOrderById(int orderNumber) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            connection = ConnectToDb.getConnection();
            String sql = "SELECT orderNumber, orderDate, requiredDate, status, comments, customerNumber FROM orders WHERE orderNumber=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, orderNumber);

            rs = statement.executeQuery();
            if (rs.next()) {
                return new Order(rs.getInt("orderNumber"), rs.getString("orderDate"),
                        rs.getString("requiredDate"), rs.getString("status"),
                        rs.getString("comments"), rs.getInt("customerNumber"));
            }
        } finally {
            rs.close();
            statement.close();
            connection.close();
        }
        return null;
    }

    public boolean deleteOrder(int orderNumber) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectToDb.getConnection();
            String sql = "DELETE FROM orders WHERE orderNumber=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, orderNumber);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                return true;
            }
        } finally {
            statement.close();
            connection.close();
        }
        return false;
    }

    public boolean addOrderToCustomer(int orderNumber, String orderDate, String requiredDate, String status, int customerNumber) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectToDb.getConnection();
            String sql = "INSERT INTO orders (orderNumber, orderDate, requiredDate, status, customerNumber) VALUES (?, ?, ?, ?, ?)";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, orderNumber);
            statement.setString(2, orderDate);
            statement.setString(3, requiredDate);
            statement.setString(4, status);
            statement.setInt(5, customerNumber);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                return true;
            }
        } finally {
            statement.close();
            connection.close();
        }
        return false;
    }

    public boolean updateOrder(int orderNumber, String status, String comment) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectToDb.getConnection();
            String sql = "UPDATE orders SET status = ?, comments = ? WHERE orderNumber = ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, status);
            statement.setString(2, comment);
            statement.setInt(3, orderNumber);

            int rowsUpdate = statement.executeUpdate();
            if (rowsUpdate > 0) {
                return true;
            }
        } finally {
            statement.close();
            connection.close();
        }
        return false;
    }
}

