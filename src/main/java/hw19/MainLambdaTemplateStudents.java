package hw19;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static hw19.FruitType.*;
import static hw19.Vitamin.*;

public class MainLambdaTemplateStudents {
    public static void main(String[] args) {
        List<Fruit> fruits = fillFruitsList();
        System.out.println("\nList of all fruits:");
        fruits.forEach(System.out::println);

        allFruitsVitaminCandA(fruits);
        allFruitsVitaminCorA(fruits);

        System.out.println("\n2: All vitamins in alphabetical order: \n" + getAllVitamins(fruits));

        System.out.println("\n3: All cheapest fruits:");
        HashMap<FruitType, Fruit> cheapestFruits = getCheapestFruits(fruits);
        for (Map.Entry<FruitType, Fruit> fruit : cheapestFruits.entrySet())
            System.out.println(fruit.getKey() + " -> " + fruit.getValue());

        threeFruitsLongestTime(fruits);

        countEachTypeFruits(fruits);

        System.out.println("\n6: Map with fruit type as key, with a list of matching fruits:");
        Map<FruitType, List<Fruit>> modifyFruit = getMapAsKeyFruitType(fruits);
        for (Map.Entry<FruitType, List<Fruit>> fruit : modifyFruit.entrySet()) {
            System.out.println("\n" + fruit.getKey() + ": ");
            System.out.print(fruit.getValue() + "\n");
        }
    }

    private static Map<FruitType, List<Fruit>> getMapAsKeyFruitType(List<Fruit> fruits) {
        return fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getFruitType,
                        Collectors.toList()));
    }

    private static void countEachTypeFruits(List<Fruit> fruits) {
        System.out.println("\n5: We have every type of fruit:");
        Map<FruitType, Long> countType;
        countType = fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getFruitType,
                        Collectors.counting()));
        System.out.println(countType);
    }

    private static void threeFruitsLongestTime(List<Fruit> fruits) {
        System.out.println("\n4: Three fruits with the longest storage time:");
        fruits.stream()
                .sorted(Comparator.comparing(Fruit::getDayToLive).reversed())
                .limit(3)
                .forEach(System.out::println);
    }

    private static HashMap<FruitType, Fruit> getCheapestFruits(List<Fruit> fruits) {
        return fruits.stream()
                .sorted(Comparator.comparing(Fruit::getPrice))
                .collect(Collectors.toMap(Fruit::getFruitType,
                        Function.identity(),
                        (fruit1, fruit2) -> fruit1,
                        HashMap::new));
    }

    // String is necessary for correct alphabetical sorting
    private static TreeSet<String> getAllVitamins(List<Fruit> fruits) {
        return fruits.stream()
                .flatMap(fruit -> fruit.getVitamins().stream())
                .map(Enum::toString)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    private static void allFruitsVitaminCandA(List<Fruit> fruits) {
        System.out.println("\n1: List of fruits with vitamins C and A:");
        fruits.stream()
                .filter(fruit -> fruit.getVitamins().contains((A)) && fruit.getVitamins().contains((C)))
                .forEach(System.out::println);
    }

    private static void allFruitsVitaminCorA(List<Fruit> fruits) {
        System.out.println("\n1: List of fruits with vitamins C or A:");
        fruits.stream()
                .filter(fruit -> fruit.getVitamins().contains((A)) || fruit.getVitamins().contains((C)))
                .forEach(System.out::println);
    }

    private static List<Fruit> fillFruitsList() {
        List<Fruit> fruits = new ArrayList<>();

        Fruit fruit = new Fruit(APPLE, 30, LocalDate.of(2019, 1, 4), 12, null);
        fruit.setVitamins(List.of(B, C));
        fruits.add(fruit);

        fruit = new Fruit(STRAWBERRY, 15, LocalDate.of(2019, 1, 2), 50, null);
        fruit.setVitamins(List.of(A, C));
        fruits.add(fruit);

        fruit = new Fruit(PEAR, 30, LocalDate.of(2019, 1, 4), 40, null);
        fruit.setVitamins(List.of(A, B1, B2, C));
        fruits.add(fruit);

        fruit = new Fruit(ORANGE, 60, LocalDate.of(2019, 1, 3), 30, null);
        fruit.setVitamins(List.of(E, B, A));
        fruits.add(fruit);

        fruit = new Fruit(STRAWBERRY, 25, LocalDate.of(2019, 1, 2), 60, null);
        fruit.setVitamins(List.of(A, C, D));
        fruits.add(fruit);

        fruit = new Fruit(PEAR, 15, LocalDate.of(2019, 1, 4), 40, null);
        fruit.setVitamins(List.of(A, B, B1, B2, P));
        fruits.add(fruit);

        fruit = new Fruit(PEAR, 5, LocalDate.of(2019, 1, 6), 10, null);
        fruit.setVitamins(List.of(B1, B2, P));
        fruits.add(fruit);

        fruit = new Fruit(APPLE, 30, LocalDate.of(2019, 1, 4), 12, null);
        fruit.setVitamins(List.of(B, C));
        fruits.add(fruit);

        return fruits;
    }
}
