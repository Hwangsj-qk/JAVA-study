package java_240219.Class1;

public class Student {

    // 필드
    String name;     // 이름
    int score;      // 성적
    int age;        // 연령

    // 생성자: 초기값을 할당하는 역할
    Student() {         // Student(): 생성자
        // 기본 생성자
        System.out.println("기본 생성자 호출");
    }

    // 생성과 함게 초기화를 시켜주는 생성자
    Student(String name, int score, int age) {
        this.name = name;
        this. score = score;
        this.age = age;

    }

    //메서드
    // 초기화 하는 메서드
    void initStudent(String nameParameter, int score, int age) {   // 'student'는 어차피 자기자신이기 때문에 제거
        // 필드와 매개변수의 이름이 같아서 데이터가 입력되지 않을때
        // 1. 이름을 다르게 한다. name -> nameParameter
        name = nameParameter;        // 입력 값 = 입력 값 --> 필드에 들어가지 않아서 Student에 대입했을 때 null이 나옴.
        // 2. this 키워드를 사용한다. -> this: 이 클래스가 만든 디스턴스를 말함. (글자 색깔 잘 보기)
        this.score = score;
        this.age = age;
        // 객체의 필드 값(age)에 매개변수 (age)를 대입하겠다.

        // this는 객체 자신을 참조하는 참조 변수
    }
}
