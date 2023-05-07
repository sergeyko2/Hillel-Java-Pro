package hw33.component;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ProductRepository {
    private List<Product> products;

    @PostConstruct
    public void ProductRepositoryInit() {
        products = new ArrayList<>();
        products.add(new Product(0, "Mineral Water", 7.8));
        products.add(new Product(1, "Beer", 50.1));
        products.add(new Product(2, "Milk", 35.8));
        products.add(new Product(3, "Coca Cola", 15.4));
        products.add(new Product(4, "Apple juice", 19.2));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(int id) {
        return products.stream()
                .filter(product -> product.getId() == id)
                .findAny()
                .orElse(null);
    }

}
