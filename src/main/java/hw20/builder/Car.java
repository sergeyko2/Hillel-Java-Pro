package hw20.builder;

public class Car {
    private TypeBody typeBody;
    private Engine engine;
    private Transmission transmission;
    private Wheels wheels;
    private String color;

    @Override
    public String toString() {
        return "Car {" +
                "typeBody = " + typeBody +
                ", engine = " + engine +
                ", transmission = " + transmission +
                ", wheels = " + wheels +
                ", color = '" + color + '\'' +
                '}';
    }

    public static class Builder {
        private Car newCar;

        public Builder() {
            newCar = new Car();
        }

        public Builder withTypeBody(TypeBody typeBody) {
            newCar.typeBody = typeBody;
            return this;
        }

        public Builder withEngine(Engine engine) {
            newCar.engine = engine;
            return this;
        }

        public Builder withTransmission(Transmission transmission) {
            newCar.transmission = transmission;
            return this;
        }

        public Builder withWheels(Wheels wheels) {
            newCar.wheels = wheels;
            return this;
        }

        public Builder withColor(String color) {
            newCar.color = color;
            return this;
        }

        public Car build() {
            return newCar;
        }
    }
}
