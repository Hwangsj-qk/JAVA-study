package java_240216.class0;

public class Class5 {    public static void main(String[] args) {

    // 객체를 메소드로 전달(참조값 복사)
    // 메소드 내에서 변경된 필드 값들은 실제 객체에 적용이 된다.
    Student student1 = createStudent("홍길동", 80, 30);    //객체의 참조값을 받는다.
    Student student2 = createStudent( "임꺽정", 70, 40);

    // Extract Method 기능으로 객체의 필드에 접근하는 반복되는 코드 블로 메서드로 만든다.
    // 전달된 학생 객체의 필드 값을 읽어서 출력할 수 있다.
    printInformation(student1);
    printInformation(student2);

    // 배열 사용하기
    // 학생 타입의 배열을 선언
    Student[] students = new Student[2];
    students[0] = student1;
    students[1] = student2;

    for (int i = 0; i < students.length; i++) {
        printInformation(students[i]);

    }
}

    private static void printInformation(Student students) {
        System.out.println("[학생 이름: " + students.name + ", 점수: " + students.score + ", 나이: "
                + students.age + "]");
    }

    // 학생 개체의 생성해주는 메소드 (메소드는 스택에 쌓인다)
    public static Student createStudent(String name, int score, int age) {
        Student student = new Student();    // 생성된 객체(학생 타입의 인스턴스)는 heap에 던져짐
        // 스택에 있는 student와 힙에 있는 Student는 참조값(메모리 주소)로 연결되어 있다.
        student.name = name;
        student.score = score;
        student.age = age;
        return student;     //객체(객체의 참조값 => 0x100)
    }
}
