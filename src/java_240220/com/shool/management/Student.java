package java_240220.com.shool.management;

public class Student {
    // 인스턴스 변수 생성
    private String name;
    private String studentId;

    // 생성자 (초기화)
    Student() {
        this.name = name;
        this.studentId = studentId;
    }

    // 메서드 생성
    // Setter
    public void setName(String name) {
        this.name = name;
        System.out.println("이름: " + name);
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
        System.out.println("ID: " + studentId);
    }
    // Getter
    public String getName() {
        return name;
    }
    public String getStudentId() {
        return name;
    }
}
