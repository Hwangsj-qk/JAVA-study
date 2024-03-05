package java_240305.library.lang;

public class Equals {
    // Object 클래스의 equals 메서드는 객체의 동등성을 비교하는데 사용
    // 기본 구현 값: this == obj => 실제로 같은 객체인지 비교
    // 오버라이딩을 통해서 논리적 동등성을 구현할 수 있다.
    Object object;
    String string;

    public static void main(String[] args) {
        Person person1 = new Person("홍길동", 30);
        Person person2 = new Person("홍길동", 30);
        Person person3 = new Person("홍길동", 60);
        Person person4 = null;
        Cat person5 = new Cat("홍길동", 30);



        // 동등성 비교
        System.out.println(person1.equals(person2));    // false -> 다른 메모리 객체에 담겨 있음(따라서 객체간 비교를 하기 위해서 equals 메서드 오버라이딩 필요)
        // 메서드 오버라이딩 후 true
        System.out.println(person1.equals(person3));    // true -> equals 메서드에서 이름만 비교했기 때문에 똑같은지 상관이 없음 따라서 equals 메서드에 나이에 관한 조건 필요
        // 나이에 대한 조건 설정 후 false
        System.out.println(person1.equals(person4));
        System.out.println(person1.equals(person5));
    }
}

class Cat{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Person {
    // 필드
    private String name;
    private int age;

    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메서드
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        // 객체가 정말 같은 경우 => 동등
        if (this == obj) return true ;

        // 객체가 null인 경우 => false
        if(obj == null) return false;

        // 타입이 같은지 비교
        if(getClass() != obj.getClass()) return false;

        // 필드 값을 비교해서 두 필드(이름 영역)가 같으면 => 동등(true) + 나이까지 같아서 동등(true)
        return ((Person) obj).name.equals(name) && age == ((Person) obj).age;

    }
}
