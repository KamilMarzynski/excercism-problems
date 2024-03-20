public enum LogLevel {
    UNKNOWN(0),
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42);

    private final int severityLevel;

    LogLevel(int severityLevel) {
        this.severityLevel = severityLevel;
    }

    public int getSeverityLevel() {
        return this.severityLevel;
    }
}
