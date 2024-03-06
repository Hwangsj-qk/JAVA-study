package java_240305.library.lang;

public class StringMethod2 {
    public static void main(String[] args) {
        String str = "오늘은 3월 6일, 곧 점심시간이네요.";

        // 5. charAt : (인덱스)번재 '문자(char)'를 반환
        char c1 = str.charAt(0);    // 오
        System.out.println("c1 = " + c1);
        
        char c10 = str.charAt(10);
        System.out.println("c10 = " + c10); //" "(공백)
        // 0번지부터 시작, 공백도 포함
    }
}
