package exercises.string;

import static java.lang.String.format;

public class STRINGS_A_LogLevel {

    /*
    * 1. Get message from a log line
    * Implement the (static) LogLevels.message() method to return a log line's message:
    * LogLevels.message("[ERROR]: Invalid operation")
    * => "Invalid operation"
    *
    * 2. Get log level from a log line
    * Implement the (static) LogLevels.logLevel() method to return a log line's log level, which should be returned in lowercase:
    * LogLevels.logLevel("[ERROR]: Invalid operation")
    * => "error"
    *
    * 3. Reformat a log line
    * Implement the (static) LogLevels.reformat() method that reformats the log line, putting the message first and the log level after it in parentheses:
    * LogLevels.reformat("[INFO]: Operation completed")
    * => "Operation completed (info)"
    * */
    public static String message(String logLine) {
        return logLine.split("]: ")[1]
                .trim();
    }
    public static String logLevel(String logLine) {
        return logLine.split("]: ")[0]
                .substring(1)
                .toLowerCase();
    }
    public static String reformat(String logLine) {
        return format("%s (%s)", message(logLine), logLevel(logLine));
    }

    //////////// MINHA ALTERAÇÃO
//    public static String message(String logLine) {
//        if (logLine.contains("[INFO]:")) logLine = logLine.replace("[INFO]:", "");
//        else if (logLine.contains("[WARNING]:")) logLine = logLine.replace("[WARNING]:", "");
//        else if (logLine.contains("[ERROR]:")) logLine = logLine.replace("[ERROR]:", "");
//        return logLine.replace("\t", "").trim();
//    }
//
//    public static String logLevel(String logLine) {
//        String logLevel = null;
//        if (logLine.contains("[INFO]:")) logLevel = "info";
//        else if (logLine.contains("[WARNING]:")) logLevel = "warning";
//        else if (logLine.contains("[ERROR]:")) logLevel = "error";
//        return logLevel;
//    }
//
//    public static String reformat(String logLine) {
//        String message = LogLevels.message(logLine);
//        String level = LogLevels.logLevel(logLine);
//        return message + " (" + level + ")";
//    }
}
