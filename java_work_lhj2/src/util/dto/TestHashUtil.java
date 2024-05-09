package util.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestHashUtil {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public static String formatDateTime(LocalDateTime dateTime) {
        return dateTime.format(formatter);
    }
}