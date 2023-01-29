package hw8;

public class MainApp {

    public static void main(String[] args) throws InterruptedException {

        String[] exampleLogs = new String[]{
                "Lso was triggered",
                "Connection telemetry fields and analysis usage",
                "Dump after return from D3 after cmd",
                "Firmware S3 times. SuspendStart: 0, SuspendEnd: 0",
                "Change Reason: System time synchronized with the hardware clock",
                "The system has resumed from sleep.",
                "The boot type was 0x2.",
                "The bootmgr spent 0 ms waiting for user input.",
                "Scan started on selected drives and folders and all extensions.",
                "Offline downlevel migration succeeded."
        };

        FileLoggerConfiguration config = new FileLoggerConfiguration();
        FileLogger fileLogger = new FileLogger(config);

        for (int i = 1; i < 10; i++) {

            fileLogger.info(exampleLogs[randomIndex(10)]);
            Thread.sleep((long) (Math.random() * 10000));
            fileLogger.info("222222222222");
            Thread.sleep((long) (Math.random() * 10000));
            fileLogger.debug("3333333333");
            Thread.sleep((long) (Math.random() * 10000));
            fileLogger.info("4444444444");
        }

    }

    private static int randomIndex(int maxRandom) {
        return (int) (Math.random() * maxRandom);
    }
}
