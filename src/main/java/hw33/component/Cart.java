package hw33.component;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Cart {
    private List<Product> productsCart = new ArrayList<>();

    public void addProduct(Product product) {
        productsCart.add(product);
    }

    public void removeProduct(int id) {
        productsCart.removeIf(product -> product.getId() == id);
    }

    public List<Product> getAllProduct() {
        return productsCart;
    }

    public void showWelcome() {
        System.out.println("\nPress 1 - Add product to cart\n" +
                "Press 2 - Remove product from cart\n" +
                "Press other number - Exit");
    }
}
