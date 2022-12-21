package task1;

public class Cat implements Participant {
    private String personalName;

    public Cat(String personalName) {
        this.personalName = personalName;
    }

    @Override
    public String run() {
        return "Cat " + personalName + " ran ";
    }

    @Override
    public String jump() {
        return "Cat " + personalName + " jumped ";
    }
}
