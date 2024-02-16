package JAVA_240207.variable;

public class Type6 {
    public static void main(String[] args) {
        // 문자열은 연산 자동 타입 변환
        // "문자열" (한 개짜리 문자가 여러 개 존재)
        // ("문자열" + 숫자) or (숫자 + "문자열") => "문자열숫자"
        System.out.println(3+7);    // 10
        System.out.println("3" + 7);    // "37" (문자열숫자)
        System.out.println(3 + "7");    // "37" (문자열숫자)
    }
}
