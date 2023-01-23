package hw8;

public class FileLoggerConfiguration {

    private String fileName;
    private LoggingLevel currentLoggingLevel;
    private double maxSizeByte;
    private String formatWrite;

    public FileLoggerConfiguration(String fileName, LoggingLevel currentLoggingLevel, double maxSizeByte, String formatWrite) {
        this.fileName = fileName;
        this.currentLoggingLevel = currentLoggingLevel;
        this.maxSizeByte = maxSizeByte;
        this.formatWrite = formatWrite; // [ПОТОЧНИЙ_ЧАС][DEBUG] Повідомлення: [СТРОКА-ПОВІДОМЛЕННЯ]
    }
}
