package hw20.factory;

public class FurnitureFactory {

    public Furniture furnitureBuild(FurnitureType furnitureType){
        return switch (furnitureType){
            case CHAIR -> new Chair();
            case SOFA -> new Sofa();
            case TABLE -> new Table();
            default -> throw new IllegalArgumentException("Unknown type furniture" + furnitureType);
        };
    }
}
