package JAVA_240207.variable;

public class Ex3 {
    public static void main(String[] args) {
        // 100억을 담는 변수를 선언하세요(타입 설정)
        // 그 변수를 출력해보세요
        // boolean 타입의 변수를 선언하고 출력해보세요.

        long a = 10_000_000_000L;   // 10억이 넘는 경우 long 사용하기 (쉼표 대신에 언더바 사용 가능)
        System.out.println(a);
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 + "/" + b2);
    }

}
