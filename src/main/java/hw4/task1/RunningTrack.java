package task1;

public class RunningTrack implements Barrier {
    private double length;

    public RunningTrack(double length) {
        this.length = length;
    }

    @Override
    public String name() {
        return "treadmill";
    }

    @Override
    public String overcome(Participant participant) {
        return participant.run() + length + "m om the " + name();
    }
}
