package JAVA_240208.condition;

public class Ex7 {
    public static void main(String[] args) {
        /*
         삼항연산자를 사용해서 짝수와 홀수를 구별하는 프로그램을 작성해주세요.
         Hint : num % 2
         */

        int num = 2;
//        System.out.println(num %2 == 0 ? "홀수": "짝수");  // 삼항연산자를 사용한 짝수와 홀수 구별
        if (num % 2 == 0) {
            System.out.println("홀수");
        } else {
            System.out.println("짝수");
        }
    }
}
