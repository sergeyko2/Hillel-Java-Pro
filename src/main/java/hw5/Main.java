package task5;

import java.util.Scanner;

public class Main {

    static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        showQuestion();
    }

    private static void showQuestion() {
        System.out.println("""
                --------------------------
                What animal?
                1 - Cat
                2 - Dog
                Exit: different number""");
        int key = scan.nextInt();
        if (key == 1) inputCat();
        if (key == 2) inputDog();
        if (key != (1 | 2)) exitApp();
    }

    private static void inputCat() {
        Cat cat = new Cat(getName());
        System.out.println("1 - Run\n2 - Swim");
        int key = scan.nextInt();
        if (key == 1) System.out.println(cat.run(getDistance()));
        if (key == 2) System.out.println(cat.swim(getDistance()));
        showQuestion();
    }

    private static void inputDog() {
        Dog dog = new Dog(getName());
        System.out.println("1 - Run\n2 - Swim");
        int key = scan.nextInt();
        if (key == 1) System.out.println(dog.run(getDistance()));
        if (key == 2) System.out.println(dog.swim(getDistance()));
        showQuestion();
    }

    private static String getName() {
        System.out.print("Name? ");
        return scan.next();
    }

    private static double getDistance() {
        System.out.print("Distance? ");
        return scan.nextDouble();
    }

    private static void exitApp() {
        System.out.println("--------------------------\nTotal animals: "
                + Animal.getCountAnimal() + "\nTotal cats: "
                + Cat.getCountCat() +"\nTotal dogs: " + Dog.getCountDog());
        System.exit(0);
    }
}