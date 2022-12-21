package task5;

public abstract class Animal {

    private String name;

    // Var for calculate total animals
    private static int countAnimal;

    public abstract String run(double x);
    public abstract String swim(double x);

    // getter-setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCountAnimal() {
        return countAnimal;
    }

    public static void setCountAnimal(int countAnimal) {
        Animal.countAnimal = countAnimal;
    }
}
