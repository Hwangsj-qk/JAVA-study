package java_240219.Class1;

public class Member {
    String name;     // 이름
    int score;      // 성적
    int age;        // 연령

    // 생성자
    // 생성자는 Return 타입이 없다. (void, int 등 필요 X)
    // 생성자는 클래스의 이름과 같아야 한다.
    // 생성자가 하나라도 존재할 경우, 기본 생성자가 제공되지 않는다. (기본생성자: 입력값을 아무것도 받지 않는 생성자)
    // 그래서 입력값을 넣지 않은 기본 생성자를 주면 컴파일 에러


    Member (String name, int score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;

    }
    // 생성자 오버로딩: 매개변수의 개수, 순서가 다르거나, 타입이 다를 경우
    Member (String name, int age) {    // 기본 생성자를 만들면 입력값을 입력하지 않아도 오류 해결
        this.name = name;
        this.age = age;
        this.score = 50;
    }

    Member (String name) {  // 기본 생성자를 만들면 입력값을 입력하지 않아도 오류 해결
//        System.out.println("매개변수 한개짜리 생성자 호출");
        this(name, 0,0);    // 생성자의 첫줄에만 호출 가능 위에 다른 코드가 있으면 컴파일 에러
        this.name = name;
        this.age = 0;
        this.score = 50;

    }

}
