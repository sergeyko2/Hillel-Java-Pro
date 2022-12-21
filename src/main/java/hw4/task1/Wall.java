package task1;

public class Wall implements Barrier {
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public String name() {
        return "wall";
    }

    @Override
    public String overcome(Participant participant) {
        return participant.jump() + "over a " + height + "m " + name();
    }
}
