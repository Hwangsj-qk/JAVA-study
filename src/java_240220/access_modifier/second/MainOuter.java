package java_240220.access_modifier.second;

import java_240220.access_modifier.first.Data;
public class MainOuter {
    public static void main(String[] args) {
        Data data = new Data();

        // 외부 + 다른 패키지 접근시 private, default 접근 불가
        // 필드
        data.publicData = 1000;
        // data.defaultData = 1000;
        // data.privateData

        // 메서드
        data.publicMethod();
        // data.defaultMethod();
        // data.privateMethod()
    }
}

