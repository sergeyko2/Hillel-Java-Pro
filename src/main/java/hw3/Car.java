package task1;

public class Car {

    public void start() {
        System.out.println(startElectricity() + "\n" + startCommand() + "\n" + startFuelSystem());
    }

    private String startElectricity() {
        return "Turn on electricity";
    }

    private String startCommand() {
        return "Ignition on";
    }

    private String startFuelSystem() {
        return "Fuel supply on";
    }


}
