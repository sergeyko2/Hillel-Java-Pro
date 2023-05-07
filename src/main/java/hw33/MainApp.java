package hw33;

import hw33.component.Cart;
import hw33.component.ProductRepository;
import hw33.config.AppConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ProductRepository productRepository = context.getBean(ProductRepository.class);

        System.out.println("All products in store: ");
        productRepository.getAllProducts().forEach(System.out::println);

        Cart cart = context.getBean(Cart.class);
        Scanner scan = new Scanner(System.in);

        while (true) {
            cart.showWelcome();
            switch (scan.nextInt()) {
                case 1 -> {
                    System.out.print("Enter product ID to add: ");
                    cart.addProduct(productRepository.getProductById(scan.nextInt()));
                    System.out.println("Your current shopping cart:\n" + cart.getAllProduct());
                }
                case 2 -> {
                    System.out.print("Enter product ID to remove: ");
                    cart.removeProduct(scan.nextInt());
                    System.out.println("Your current shopping cart:\n" + cart.getAllProduct());
                }
                default -> System.exit(0);
            }
        }
    }
}
