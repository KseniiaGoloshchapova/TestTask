package framework.settings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

public class LoggerConfiguration {

    public static Logger LOG = LoggerFactory.getLogger(LoggerConfiguration.class);

    /**
     * Writes an information message into log
     *
     * @param message message to be written
     */
    public static void info(String message) {
        LOG.info(String.format("[%s] %s", LocalDateTime.now(), message));
    }

    /**
     * Writes a warning message into log
     *
     * @param message message to be written
     */
    public static void warning(String message) {
        LOG.warn(String.format("[%s] %s", LocalDateTime.now(), message));
    }

    /**
     * Writes a error message into log
     *
     * @param message message to be written
     */
    public static void error(String message) {
        LOG.error(String.format("[%s] %s", LocalDateTime.now(), message));
    }
}
