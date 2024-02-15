package JAVA_240207.variable;

public class Var3 {
    public static void main(String[] args) {
        // 변수의 사용
        int hour = 5;
        int minute = 15;

        System.out.println(hour + "시 " + minute + '분');

        // 시간을 분으로 변환해 저장
//        int totalMinute = _________;
        int totalMinute = hour * 60 + minute;
        System.out.println("총 " + totalMinute + "분");
    }
}
