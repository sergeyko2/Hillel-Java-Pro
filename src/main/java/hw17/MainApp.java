package hw17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static hw17.ProductType.*;

public class MainApp {
    public static void main(String[] args) {
        List<Product> products = addProductsList();
        products.forEach(System.out::println);

        getBookPrice250(products).forEach(System.out::println);

        getBookDiscount(products).forEach(System.out::println);

        getBookCheapest(products).forEach(System.out::println);

        getThreeMostRecentlyAdded(products).forEach(System.out::println);

        System.out.println("\nThe total cost of BOOK (price >75) for this year: " +
                getCalSomeProductsThisYear(products));
    }

    private static List<Product> getBookPrice250(List<Product> products) {
        System.out.println("\nAll BOOKS with price > 250:");
        return products.stream()
                .filter(product -> BOOK == product.getProductType())
                .filter(product -> product.getPrice() > 250)
                .toList();
    }

    private static List<Product> getBookDiscount(List<Product> products) {
        System.out.println("\nAll BOOKS with discount (10%):");
        return products.stream()
                .filter(product -> BOOK.equals(product.getProductType()))
                .filter(Product::isDiscount)
                .map(product -> new Product(product.getProductType(), product.getPrice() * 0.9, product.isDiscount(), product.getDateAdded()))
                .toList();
    }

    private static List<Product> getBookCheapest(List<Product> products){
        System.out.println("\nCheapest product:");
        return products.stream()
                .filter(product -> BOOK.equals(product.getProductType()))
                .min(Comparator.comparing(Product::getPrice))
                .stream().toList();

    }

    private static List<Product> getThreeMostRecentlyAdded(List<Product> products) {
        System.out.println("\nThree latest added products:");
        return products.stream()
                .sorted(Comparator.comparing(Product::getDateAdded).reversed())
                .limit(3)
                .toList();
    }

    private static double getCalSomeProductsThisYear(List<Product> products) {
        return products.stream()
                .filter(product -> !product.getDateAdded().isBefore(LocalDate.of(2023, 1, 1)))
                .filter(product -> BOOK.equals(product.getProductType()))
                .filter(product -> product.getPrice() > 75)
                .mapToDouble(Product::getPrice)
                .sum();
    }

    private static List<Product> addProductsList() {
        List<Product> products = new ArrayList<>();

        products.add(new Product(BOOK, 23, true, LocalDate.of(2023, 7, 1)));
        products.add(new Product(BOOK, 280, true, LocalDate.of(2023, 1, 1)));
        products.add(new Product(BOOK, 255, false, LocalDate.of(2019, 1, 1)));
        products.add(new Product(BOOK, 230, false, LocalDate.of(2023, 3, 1)));
        products.add(new Product(TOY, 540, true, LocalDate.of(2022, 3, 1)));
        products.add(new Product(TOY, 250, false, LocalDate.of(2023, 10, 1)));
        products.add(new Product(FOOD, 15, false, LocalDate.of(2022, 12, 1)));
        products.add(new Product(FOOD, 140, true, LocalDate.of(2022, 5, 1)));
        products.add(new Product(LAPTOPS, 40000, true, LocalDate.of(2020, 5, 1)));
        products.add(new Product(COMPUTER, 30000, true, LocalDate.of(2023, 11, 1)));
        products.add(new Product(CLOTHES, 500, true, LocalDate.of(2022, 8, 1)));
        products.add(new Product(FOOTWEAR, 1000, true, LocalDate.of(2022, 12, 1)));
        products.add(new Product(ALCOHOL, 100, false, LocalDate.of(2023, 1, 1)));
        return products;
    }
}
