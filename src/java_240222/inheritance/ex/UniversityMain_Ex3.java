package java_240222.inheritance.ex;

public class UniversityMain_Ex3 {
    public static void main(String[] args) {
        Professor_Ex3 professorEx3 = new Professor_Ex3();
        professorEx3.name = "John Doe";
        professorEx3.age = 40;
        professorEx3.department = "컴퓨터 과학";
        professorEx3.introduce();

        Student_Ex3 studentEx3 = new Student_Ex3();
        studentEx3.name = "Jane Smith";
        studentEx3.age = 20;
        studentEx3.studentId = 20201234;
        studentEx3.introduce();
    }
}
