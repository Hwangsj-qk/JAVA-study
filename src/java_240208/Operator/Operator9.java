package java_240208.Operator;

public class Operator9 {
    public static void main(String[] args) {
        // 논리 연산자
        // boolean형인 true와 false를 비교하는데 사용한다.
        /*
        &&(and, 그리고): 두 피연산자가 모두 참이면 참, 하나라도 거짓이면 거짓
        ||(or, 또는): 두 피연산자 중 하나만 참이라도 참, 둘 다 거짓이면 거짓
        ! (not, 부정): 참이면 거짓, 거짓이면 참 (ex. != => 같지 않다)
         */

        System.out.println("And 연산");
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        System.out.println("or 연산");
        System.out.println(true || true); //true
        System.out.println(true || false ); //true
        System.out.println(false || true); //true
        System.out.println(false || false); //false

        System.out.println("부정 연산");
        System.out.println(!true); //false
        System.out.println(!false) ; //true
    }
}
