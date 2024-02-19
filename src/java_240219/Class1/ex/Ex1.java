package java_240219.Class1.ex;

public class Ex1 {
    public static void main(String[] args) {
        //Person 클래스를 설계해주세요
        // 필드: name, age, gender
        // 생성자: 모든 속성을 초기화하는 생성자, 이름, 성별만 초기화하는 생성자
        // 메서드; 필드 정보를 출력하은 printinfo()

        // main 메서드에서 사용해보세요.

        Person person = new Person("홍길동", 30, "남성");
        Person person1 = new Person("심청이", 20, "여성");
        Person person2 = new Person("임꺽정", 50, "남성");
        Person person3 = new Person("유관순", "여자");

        person.printInfo();
        person1.printInfo();
        person2.printInfo();
        person3.printInfo();
    }

}
