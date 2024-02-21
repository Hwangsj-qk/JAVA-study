package java_240221.ex;

public class Logger {
    // 필드
    static String logLevel = "INFO";


    // 메소드


    public static void setLogLevel(String logLevel) {
        Logger.logLevel = logLevel;
    }

    static void logInfo(String logInfo) {
        System.out.println("[INFO]" + logInfo);
    }
    static void logError(String logError) {
        if (logLevel.equals("ERROR")) {
            // logLevel에 어차피 INfO 아니 ERROR가 들어간 값에 따라 메시지가 출력 되므로 둘을 비교해야함.
            System.out.println("[ERROR]" + logError);
        }else {
            return;
        }
    }



}
