package JAVA_240207.variable;

public class Type4 {
    public static void main(String[] args) {
        // 강제 타입 변환 Casting
        // 큰 타입을 작은 타입으로 강제로 나눠서 저장하는 것.
        int i = 10;
//        byte b = i;  -> 큰 타입에서 작은 타입으로의 변환은 자연스럽게 되지 않음 (int > byte)
        byte b = (byte) i;  // 작은 타입으로 강제로 전환(Casting은 연산자()를 사용)

        double d = 3.14;
        System.out.println(d);
        int i2 = (int) d; // 캐스팅 연산자 사용
        System.out.println(i2);
        // 실수 타입이 정수 타입으로 캐스팅 될 때는 소수점 이하 부분은 버려진다. (정수는 소수를 담을 수 없기 때문)

    }
}
