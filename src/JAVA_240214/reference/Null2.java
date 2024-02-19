package JAVA_240214.reference;

public class Null2 {
    public static void main(String[] args) {
        Data data = null; // 에러
//        Data data = new Data(); // 작동
        data.value1 = 100;
        // 에러: Cannot assign field "value1" because "data" is null
        // null.value1 = 100; <- 참조할 주소가 존재하지 않는다.
        // NullPointException 이 발생하여 프로그램이 종료된다.
        System.out.println(data.value1);
    }
}
