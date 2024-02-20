package java_240220.com.shool.management;

public class Ex1_Student {
    public static void main(String[] args) {

        Student student = new Student();

        System.out.println("실행결과");
        System.out.println("========");
        student.setName("홍길동");
        student.setStudentId("S1234");

        student.getName();
        student.getStudentId();



    }
}
