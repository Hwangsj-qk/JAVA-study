package java_240305.library.lang;

public class HashCode {
    public static void main(String[] args) {
        // Object 클래스의 hashcode
        // 기본적으로 메모리 주소를 기반으로 한 정수값을 가짐.
        Object object = new Object();
        System.out.println(object.hashCode());  // 189568618
        System.out.println(object); //java.lang.Object@b4c966a
    }

}
