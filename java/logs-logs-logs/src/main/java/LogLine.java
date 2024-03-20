public class LogLine {
    private String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String logLevelString = logLine.split(":")[0];
        switch (logLevelString) {
            case "[TRC]":
                return LogLevel.TRACE;
            case "[DBG]":
                return LogLevel.DEBUG;
            case "[INF]":
                return LogLevel.INFO;
            case "[WRN]":
                return LogLevel.WARNING;
            case "[ERR]":
                return LogLevel.ERROR;
            case "[FTL]":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        LogLevel logLevel = this.getLogLevel();

        return logLevel.getSeverityLevel() + ":" + logLine.split(": ")[1];
    }
}
