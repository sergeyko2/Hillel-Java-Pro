package hw8;

public class FileLoggerConfiguration {


    private String fileName = "src\\main\\resources\\hw8\\log.txt";
    private LoggingLevel currentLoggingLevel = LoggingLevel.DEBUG;
    private double maxSizeByte = 5000;
    private String formatWrite = "[CURRENT_TIME][DEBUG] Massage: [STRING_MESSAGE]";

    public String getFileName() {
        return fileName;
    }

    public LoggingLevel getCurrentLoggingLevel() {
        return currentLoggingLevel;
    }

    public double getMaxSizeByte() {
        return maxSizeByte;
    }
}
