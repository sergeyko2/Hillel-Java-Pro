package hw22.coffee.order;

public class Order {
    private int number;
    private String client;

    public Order(String client) {
        this.client = client;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getClient() {
        return client;
    }

    @Override
    public String toString() {
        return number + " | " + client;
    }
}
