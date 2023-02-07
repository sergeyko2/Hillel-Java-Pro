package hw17;

import java.time.LocalDate;

public class Product {

    private LocalDate dateAdded;
    private ProductType productType;
    private double price;
    private boolean discount;

    public Product(ProductType productType, double price, boolean discount, LocalDate dateAdded) {
        this.productType = productType;
        this.price = price;
        this.discount = discount;
        this.dateAdded = dateAdded;
    }

    public ProductType getProductType() {
        return productType;
    }

     public double getPrice() {
        return price;
    }

    public boolean isDiscount() {
        return discount;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    @Override
    public String toString() {
        return "Product {" +
                "productType=" + productType +
                ", price=" + price +
                ", discount=" + discount +
                ", dateAdded=" + dateAdded +
                '}';
    }
}
