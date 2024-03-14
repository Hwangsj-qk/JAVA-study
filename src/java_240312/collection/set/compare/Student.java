package java_240312.collection.set.compare;

public class Student implements Comparable<Student> {
    // 필드
    private int StudentNo;
    private static int lastStudentNo = 2024000;     // 생성 마지막 학번
    private String name;
    private int age;
    private double height;

    // 생성자
    public Student(String name, int age, double height) {
        this.StudentNo = ++ lastStudentNo;      // 생성할 때마다 학번이 자동 부여
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public int getStudentNo() {
        return StudentNo;
    }

    // toString 오버라이딩
    @Override
    public String toString() {
        return "Student{" +
                "StudentNo=" + StudentNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    // compareTo 오버라이딩
    @Override
    public int compareTo(Student other) {
        // 기본 정렬 = 학번 순
        return this.StudentNo - other.StudentNo;
    }


}
