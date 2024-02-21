package java_240221.ex;

public class MathUtility {
  // 유틸리티 클래스는 보통 필드가 없음

    public static int max(int a, int b) {
        if (a > b) {
            return  a;
        }else {
            return b;
        }

    }
    public static int min(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
//        return a < b ? a: b;  => 간단해서 삼항연산자 사용 가능
    }
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = n; i >= 1; i--) {
            result *= i;
        }
        return result;
    }

}
