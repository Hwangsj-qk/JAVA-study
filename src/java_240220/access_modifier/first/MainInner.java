package java_240220.access_modifier.first;

public class MainInner {
    public static void main(String[] args) {
        Data data = new Data();

        // 외부 + 같은 패키지 접근시 private 접근 불가
        // 필드
        data.publicData = 1000;
        data.defaultData = 100;
//        data.privateData = 10;        // 불가

        // 메서드
        data.publicMethod();
        data.defaultMethod();
        // data.privateMethod()       // 불가

    }
}

