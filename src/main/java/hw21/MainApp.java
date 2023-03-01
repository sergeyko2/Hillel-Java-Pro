package hw21;

import myMathMethods.FactorialMyNumber;
import myMathMethods.RandomNumber;

public class MainApp {
    public static void main(String[] args) {
        long random;
        long factorial;

        random = new RandomNumber().randomLong(5, 20);
        System.out.println("A random number from 5 to 20 = " + random);

        factorial = new FactorialMyNumber().factorial(random);
        System.out.println("Factorial for " + random + " = " + factorial);

    }
}
