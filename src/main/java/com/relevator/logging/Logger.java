package com.relevator.logging;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The Logger class provides simple logging functionalities.
 */
public class Logger {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public static void log(String message) {
        System.out.println("[" + dtf.format(LocalDateTime.now()) + "] " + message);
    }
}
