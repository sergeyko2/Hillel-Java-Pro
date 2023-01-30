package hw8;

import java.util.Random;

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

        Random random = new Random();
        int numberLogs = exampleLogs.length;
        FileLoggerConfiguration config = new FileLoggerConfiguration();
        FileLogger fileLogger = new FileLogger(config);

        for (int i = 1; i <= 10; i++) {
            String message = exampleLogs[random.nextInt(0, numberLogs)];
            if (config.getCurrentLoggingLevel() == LoggingLevel.DEBUG) {
                fileLogger.debug(message);
            } else {
                fileLogger.info(message);
            }
            Thread.sleep(random.nextLong(10000));
        }
    }
}
