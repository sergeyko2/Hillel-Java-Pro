package hw4.task1;

public class Robot implements Participant {
    private final String personalName;

    public Robot(String personalName) {
        this.personalName = personalName;
    }

    @Override
    public String run() {
        return "Robot " + personalName + " ran ";
    }

    @Override
    public String jump() {
        return "Robot " + personalName + " jumped ";
    }
}
