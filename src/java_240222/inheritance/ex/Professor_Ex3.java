package java_240222.inheritance.ex;

public class Professor_Ex3 extends Person_Ex3 {
    // 추가필드
    String department;

    @Override
    public void introduce() {
        super.introduce();
        System.out.println(department + " 학과에서 근무합니다.");
    }



}
