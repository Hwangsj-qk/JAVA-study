package JAVA_240207.variable;

public class Ex6 {
    public static void main(String[] args) {
        //Q. 빈 칸을 채우고 타입이 어떻게 왜 변하는지 스스로에게 설명해주세요.
        
        // 프로모션문제
        int num1 = 10;
        long num2 = 20L;
        long result = num1 + num2;  // long 대신 double, float도 가능
        
        // 캐스팅 문제
        double num3 = 10.5;
        int result2 = (int) num3;
        
        // 프로모션과 캐스팅
        int num4 = 10;
        double num5 = 5.5;
        int result3 = num4 + (int) num5;    // 캐스팅: 실수 5.5에서 소수자리인 0.5는 버려짐
        System.out.println("result3 = " + result3);
        
    }
}
