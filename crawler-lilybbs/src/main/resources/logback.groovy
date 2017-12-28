import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import com.google.common.base.Charsets

import static ch.qos.logback.classic.Level.INFO

appender("CONSOLE", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%d{yyyy-MM-dd HH:mm:ss} %-5level [%thread] %class{5}: %msg%n"
        charset = Charsets.UTF_8
    }
}

root(INFO, ["CONSOLE"])