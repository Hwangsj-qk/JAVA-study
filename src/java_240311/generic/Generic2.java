package java_240311.generic;

public class Generic2 {

    // 제네릭: 결정되지 않은 타입을 파라미터로 철하고, 실제 사용할 때 파라미터를 구체적인 타입으로 대체하는 기능
    static class Box<T> {
        T content;
    }

    public static void main(String[] args) {
        // Box 생성 시 T 대신 String으로 대체
        // < > 안에는 타입이 들어가야 함.
        Box<String> stringBox = new Box<String>();
        stringBox.content = "문자열";
        // -> 무엇이든지 들어갈 순 있지만 < > 안에 적게되면 그 타입만 가능함.

        // Box 생성시 T 대신 Integer로 대체
        // 우측 항에서 타입은 추론이 가능하기 때문에 생략 가능
        Box<Integer> integerBox = new Box<>();      // = new Box<Integer>();
        integerBox.content = 100;
//        Box<Int> intBox = new Box<>();      // 기본타입은 제네릭 대입 불가 => 포장 타입이 들어가야 한다.


//        String strContent = stringBox.getCon;
    }
}
