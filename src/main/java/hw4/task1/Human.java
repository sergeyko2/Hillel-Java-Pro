package hw4.task1;

public class Human implements Participant {
    private final String personalName;

    public Human(String personalName) {
        this.personalName = personalName;
    }

    @Override
    public String run() {
        return "Human " + personalName + " ran ";
    }

    @Override
    public String jump() {
        return "Human " + personalName + " jumped ";
    }
}
