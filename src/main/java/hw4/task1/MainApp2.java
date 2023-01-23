package hw4.task1;

public class MainApp2 {
    public static void main(String[] args) {
        Participant[] participants = {new Human("Slavik"), new Cat("Barsik"), new Robot("Verter")};
        Barrier[] barriers = {new RunningTrack(2.1), new RunningTrack(10.3), new Wall(2.1), new RunningTrack(5.4), new Wall(1.8)};

        showCompetition(participants, barriers);
    }

    private static void showCompetition(Participant[] participants, Barrier[] barriers) {
        for (Participant member : participants)
            for (Barrier barrier : barriers)
                System.out.println(barrier.overcome(member));
    }
}
