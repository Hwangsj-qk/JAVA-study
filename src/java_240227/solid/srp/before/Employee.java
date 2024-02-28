package java_240227.solid.srp.before;

public class Employee {
    // SRP(단일책임원칙) 적용 전
    // 직원 정보를 저장하고, 직원에게 이메일을 보내는 두가지 책임을 가지고 있음
    // => SRP를 적용하면 하나의 책임만 가질 수 있음

    public void saveEmployeeToDatabase() {
        System.out.println("직원 정보 데이터베이스 저장 로직");
    }

    public void sendEmailToEmployee() {
        System.out.println("직원에게 이메일 보내는 로직");
    }
}
