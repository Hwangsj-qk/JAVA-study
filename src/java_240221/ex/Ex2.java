package java_240221.ex;

public class Ex2 {

    // 스태틱 import를 사용하면 클래스 이름 생략하고 메서드 호출 가능
    public static void main(String[] args) {
        System.out.println("Max of 10, 20: " + MathUtility.max(10, 20));
        System.out.println("Min of 10, 20: " + MathUtility.min(10, 20));
        System.out.println("Sum of 10, 20: " + MathUtility.sum(10, 20));
        System.out.println("Factorial of 5: " + MathUtility.factorial(5));

    }
}
