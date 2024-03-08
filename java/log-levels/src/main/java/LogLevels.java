public class LogLevels {

    public static String message(String logLine) {
        return logLine.split(":")[1].trim();
    }

    public static String logLevel(String logLine) {
        String result = logLine.split(":")[0].toLowerCase().trim();
        return result.substring(1, result.length() - 1);
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        String logLevel = logLevel(logLine);

        return message + " (" + logLevel + ")";
    }
}
