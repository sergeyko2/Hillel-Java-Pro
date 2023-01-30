package hw8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLogger {

    private FileLoggerConfiguration config;

    public FileLogger(FileLoggerConfiguration config) {
        this.config = config;
    }

    public void debug(String report) {
        writerLog(report, LoggingLevel.DEBUG);
        writerLog(report, LoggingLevel.INFO);
    }

    public void info(String report) {
        writerLog(report, LoggingLevel.INFO);
    }

    private void writerLog(String message, LoggingLevel loggingLevel) {
        try (FileWriter fileLog = new FileWriter(config.getFileName(), true)) {
            checkSizeFile(new File(config.getFileName()));
            DateFormat time = new SimpleDateFormat("HH:mm:ss");
            fileLog.write("[" + time.format(new Date()) + "][" + loggingLevel + "] Message: " + message + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void checkSizeFile(File fileLog) {
        if (config.getMaxSizeByte() < fileLog.length()) {
            throw new FileMaxSizeReachedException("Maximum file size! \n" +
                    "File " + fileLog.getAbsoluteFile() + "\n" + "has the size of " + fileLog.length() + " byte\n" +
                    "The maximum allowable size - " + config.getMaxSizeByte());
        }
    }
}
