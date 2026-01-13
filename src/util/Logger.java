package util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private final String fileName;
    private static Logger instance;
    private final DateTimeFormatter formatter;

    private Logger() {
        this.formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.fileName = "logs/event_booking_logs.txt";
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        String timestamp = LocalDateTime.now().format(formatter);
        String line = String.format("%s %s", timestamp, message);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write(line);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.err.println("Error writing to file: " + fileName);
        }
    }
}
