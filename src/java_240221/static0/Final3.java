package java_240221.static0;

public class Final3 {
    // (final)상수와 참조형 변수
    public static void main(String[] args) {
        final int var1 = 100;
//        var1 = 200;       => final 값은 변경 불가
        final Data data = new Data(100);    // 0X100
        System.out.println(data.getField());

//        data = new Data(200);     => final 값은 변경 불가   0x200(참조값을 변경하는 건 불가능)
        // 참조값 변수를 final로 지정했을 때, 참조값 자체는 변경 불가능하지만,

        // 참조값에 위치해있는 객체 내부의 값을 변경하는 것은 가능하다.
        data.setField(200);     // 0x100 (그대로 참조 => 참조값 내부 객체의 값 변경)
        System.out.println(data.getField());    // 200
    }
}
