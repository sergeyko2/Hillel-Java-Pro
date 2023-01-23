package hw8;

public class FileLoggerConfiguration {

    private String fileName = "src\\main\\resources\\hw8\\log.txt";
    private LoggingLevel currentLoggingLevel = LoggingLevel.DEBUG;
    private double maxSizeByte = 500;
    private String formatWrite = "[ПОТОЧНИЙ_ЧАС][DEBUG] Повідомлення: [СТРОКА-ПОВІДОМЛЕННЯ]";

    public String getFileName() {
        return fileName;
    }

    public LoggingLevel getCurrentLoggingLevel() {
        return currentLoggingLevel;
    }

    public double getMaxSizeByte() {
        return maxSizeByte;
    }

    public String getFormatWrite() {
        return formatWrite;
    }
}
