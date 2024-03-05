package java_240305.library.lang;

public class JavaLang1 {
    // java.base 모듈
    // java.lang 패키지
    // 자바 프로그래밍 언어의 기본 클래스들을 포함하고 있고, 별도의 import 구문 없이도
    // 클래스를 사용할 수 있다.
    Object object;      // 모든 클래스의 최상위 클래스(자바는 모두 클래스로 작성되어 있음)
    // 공식문서 보는 법

    public static void main(String[] args) {
        // toString 메서드
        // 기본적으로 객체의 정보를 출력
        // 패키지경로.클래스명@해시값 => 기본 구현은 유용한 정보를 제공하지 못함
        // 객체의 상태를 더욱 잘 나타낼 수 있는 방식으로 오버라이딩하는 관행
        // 객체를 대표하는 문자열을 반환
        // 유용성: 디버깅, 로깅, 가독성 등에 유용하게 사용할 수 있다.

        Object obj = new Object();
        System.out.println(obj.toString()); //java.lang.Object@b4c966a
        // println 메서드에서 기본적으로 객체의 toString() 값을 리턴
        System.out.println(obj);    // java.lang.Object@b4c966a

        student student = new student("홍길동", "6");
        System.out.println(student.toString());     // java_240305.library.lang.student@4e50df2e
        System.out.println(student);        // java_240305.library.lang.student@4e50df2e
    }

}
class student  {
    String name;
    String grade;

    public student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

// 객체 정보를 유용하게 제공하기 위해 toString()을 오버라이드 (이제는 패키지경로.클래스면@해시값이 아닌 리턴값 반환)
    @Override
    public String toString() {
//        return super.toString();
        return "%s학년 %s 입니다.".formatted(grade, name);
    }
}