package task5;

public class Dog extends Animal {

    // Var for calculate total dog
    private static int countDog;

    public Dog(String name) {
        super.setName(name);
        Animal.setCountAnimal(Animal.getCountAnimal() + 1);
        Dog.setCountDog(Dog.getCountDog() + 1);
    }

    public String run(double x) {
        if (x >= 500) x = 500;
        if (x < 0) x = 0;
        return "Dog " + super.getName() + " ran " + x + "m";
    }

    public String swim(double x) {
        if (x >= 10) x = 10;
        if (x < 0) x = 0;
        return "Dog " + super.getName() + " swims " + x + "m";
    }

    public static int getCountDog() {
        return countDog;
    }

    public static void setCountDog(int countDog) {
        Dog.countDog = countDog;
    }
}
