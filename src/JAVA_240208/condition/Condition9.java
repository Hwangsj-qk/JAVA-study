package JAVA_240208.condition;

public class Condition9 {
    public static void main(String[] args) {

        //break문 없이 switch문을 사용하게 될 경우
        // 해당 case문 이후 모든 case를 수행
        int time = 15;

        switch (time) {
            case 8:
                System.out.println("출근시간이다.");
            case 9:
                System.out.println("입실시간이다.");
            case 10:
                System.out.println("수업시간이다.");
            case 13:
                System.out.println("점심시간이다.");
            default:
                System.out.println("집에 가자~!");
                // default는 모든 case가 아닌 경우를 의미
        }
    }
}
