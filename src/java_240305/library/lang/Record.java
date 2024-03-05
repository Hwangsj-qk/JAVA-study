package java_240305.library.lang;

// 자바 Record
// 자바 14버전부터 새롭게 도입된 데이터 구조
// VO(Value Object) 객체 또는 DTO(Data Transfer Object)를 작성할 때
// 불변하는 데이터 객체를 간단하게 정의해주는 자료구조
record Human(String name, int age) {}

public class Record{
    public static void main(String[] args) {
        Human human1 = new Human("홍길동", 30);

        // getter 메서드와 동일한 효과를 내는 메서드
        int age = human1.age();
        String name = human1.name();
        // getter 메서드를 이용한 것처럼 바로 가지고 와서 쓸 수 있음

        // toString method 오버라이딩
        System.out.println(human1.toString());

        // equals 오버라이딩
        Human human2 = new Human("홍길동", 30);
        Human human3 = new Human("임꺽정", 40);

        System.out.println("필드 값이 같을 때: " + human1.equals(human2));
        System.out.println("필드 값이 다를 때: " + human1.equals(human3));

        // hashCode 오버라이딩
        System.out.println("기본 해시코드: " + human1.hashCode());
        System.out.println("데이터가 같은경우: " + human2.hashCode());
        System.out.println("데이터가 다른경우: " + human3.hashCode());
    }

}

// 컴파일러가 자동으로 기본생성자, getter, equals, hashCode, toString 을 생성

// 레코드는 final 키워드가 적용이 되어 더이상 상속되지 않는다.
//class StrongHuman extends Human {
//    StrongHuman(String name, int age) {
//        super(name, age);
//    }
//}
