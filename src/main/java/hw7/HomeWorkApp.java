package hw7;

public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(compareTwoNumbers(54, 26));
        checkNumber(-23);
        System.out.println(checkNumber2(-23));
        cloneLine("This line will be printed multiple times", 7);
        System.out.println(leapYear(2022));
    }

    private static void printThreeWords() {
        String[] fruits = {"Orange", "Banana", "Apple"};
        for (String fruit : fruits)
            System.out.println(fruit);
    }

    private static void checkSumSign() {
        int a = 254;
        int b = -35;
        if (a + b >= 0) {
            System.out.println("The sum is positive");
        } else System.out.println("The amount is negative");
    }

    private static void printColor() {
        int value = 254;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    private static void compareNumbers() {
        int a = 24;
        int b = -35;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    private static boolean compareTwoNumbers(int a, int b) {
        int sum = a + b;
        return sum > 10 && sum <= 20;
    }

    private static void checkNumber(int a) {
        if (a >= 0) {
            System.out.println(a + " - positive number");
        } else {
            System.out.println(a + " - negative number");
        }
    }

    private static boolean checkNumber2(int a) {
        return a < 0;
    }

    private static void cloneLine(String line, int quantity) {
        for (int a = 1; a <= quantity; a++) {
            System.out.println(line);
        }
    }

    private static boolean leapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

}
