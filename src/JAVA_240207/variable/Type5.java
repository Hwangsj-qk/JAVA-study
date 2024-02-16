package JAVA_240207.variable;

public class Type5 {
    public static void main(String[] args) {
        byte v1 = 10; 
        int v2 = 100;
        long v3 = 1000L;
        
        // 정수 연산 시 가장 큰 타입에 넣으면 자동변환(promotion)이 된다. 
        long result = v1 + v2 + v3; // 자동변환 (promotion)
        
//        int result2 = v1 + v2 + v3; -> 작은 타입에 담을 시 컴파일 에러 발생
        
        // 강제 변환(Casting)
        int result2 = (int) (v1 + v2 + v3) ; // 캐스팅을 통한 강제변환
        
        int v4 = 10/4;
        System.out.println("v4 = " + v4);
        // int / double = double로 계산, int / int = int로 계산 (큰 타입이 있으면 자동으로 큰 타입으로 자동변환)

        /*
        4.0이 아니라 4를 출력하면 2.0만 나옴 -> 둘 다 정수이기 때문에 int / int로 계산이 됨. 그래서 결과도 int
        그런데 거기서 double로 담으니까 2.0이 나옴
         */
        double v5 = 10.0 / 4.0;
        System.out.println("v5 = " + v5);
    }
}
