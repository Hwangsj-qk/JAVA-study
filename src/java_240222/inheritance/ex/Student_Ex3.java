package java_240222.inheritance.ex;

public class Student_Ex3 extends Person_Ex3{
    // 추가 필드 생성
    int studentId;
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("제 학번은 " + studentId + "입니다. ");
    }
}
