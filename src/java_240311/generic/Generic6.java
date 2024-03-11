package java_240311.generic;

public class Generic6 {
    // 제네릭의 타입 경계(type bounds)
    // bounded type parameter
    // 상한(upper) 경계: 타입 매개변수로 지정할 수 있는 타입을
    // 특정 클래스의 자식 클래스나 특정 인터페이스의 구현 클래스로 제한 가능

    static class Box<T extends Number> {    // 숫자만 T에 넣을 수 있다. 문자열, 불리언 X (Number를 상속받았기 때문)
        T contents;

        public void setContents(T contents) {
            this.contents = contents;
        }

        public T getContents() {
            return contents;
        }
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();      // 정수만 들어가는 Box (Number 상속 O)
        Box<Double> doubleBox = new Box<>();        // 실수만 들어가는 Box (Number 상속 X)
//        Box<String> stringBox = new Box<>();      // Number 의 상속을 받지 않은 String 타입이므로 에러

    }
}
