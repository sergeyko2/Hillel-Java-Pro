package hw20.builder;

public class MainApp {
    public static void main(String[] args) {
        Car myCar = new Car.Builder()
                .withTypeBody(new TypeBody())
                .withEngine(new Engine())
                .withTransmission(new Transmission())
                .withWheels(new Wheels())
                .withColor("Yellow")
                .build();
        System.out.println(myCar);
    }
}
