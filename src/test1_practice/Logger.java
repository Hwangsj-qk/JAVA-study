package test1_practice;

public class Logger {
    static String logLevel = "INFO";

    static void logInfo(String s) {
        System.out.println("[INFO]" + s);
    }

    static void logError(String s) {
        if(logLevel.equals("ERROR")) {
            System.out.println("[ERROR]" + s);
        }
    }

    public static void setLogLevel(String logLevel) {
        Logger.logLevel = logLevel;
    }
}


