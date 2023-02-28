package hw20.factory;

public class MainApp {
    public static void main(String[] args) {
        FurnitureFactory factory = new FurnitureFactory();

        factory.furnitureBuild(FurnitureType.CHAIR).create();
        factory.furnitureBuild(FurnitureType.SOFA).create();
        factory.furnitureBuild(FurnitureType.TABLE).create();
    }
}
