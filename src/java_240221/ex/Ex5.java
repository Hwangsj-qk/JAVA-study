package java_240221.ex;

public class Ex5 {
    public static void main(String[] args) {
//        final double interestRate = 3.0;
        // -> 여기서 final을 걸어주면 setInterestRate를 통해 값을 변경할 수 있으나 Account 클래스 필드에서 final을 걸면
        // 세터/게터 자체가 생성이 안됨
        // 여기서는 public static final~ (X) => final만 앞에 붙여주기
        Account account = new Account("010234-5677","홍길동", 100000 );

//        account.accountNumber  = "2224334-12345"      => 접근 불가
        account.printInfo();

    }
}
