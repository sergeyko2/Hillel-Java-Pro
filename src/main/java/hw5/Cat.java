package task5;

public class Cat extends Animal {

    // Var for calculate total cat
    private static int countCat;

    public Cat(String name) {
        super.setName(name);
        Animal.setCountAnimal(Animal.getCountAnimal() + 1);
        Cat.setCountCat(Cat.getCountCat() + 1);
        }

    public String run(double x) {
        if (x >= 200) x = 200;
        if (x < 0) x = 0;
        return "Cat " + super.getName() + " ran " + x + "m";
    }

    public String swim(double x) {
        return "Cat " + super.getName() + " does not swims!";
    }

    public static int getCountCat() {
        return countCat;
    }

    public static void setCountCat(int countCat) {
        Cat.countCat = countCat;
    }
}
