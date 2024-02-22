package java_240221.ex;

import java_240220.access_modifier.first.A;

public class Account {
    /* 은행 시스템
계좌 Account 클래스
필드는
accountNumber 고유한 계좌번호
ownerName 소유자 이름
balance 잔액
interestRate 불변 고정 이자

// 생성자 : 3가지 필드 사용

// 메서드 : 필드 내용을 출력하는 정보 출력 메서드
 */

    // 필드
    private String accountNumber;   // 3개의 필드를 가져와야 하기 때문에 accountNumber은 final(X)
    String ownerName;
    int balance;
    public final static double INTEREST_RATE = 0.04;     // 초기값 입력 안하면 컴파일 에러 발생

    // 생성자
    Account(String accountNumber, String ownerName, int balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // 메서드
    public void printInfo() {
        System.out.println(accountNumber);
        System.out.println(ownerName);
        System.out.println(balance);
        System.out.println(INTEREST_RATE);
    }


//    public double getInterestRate() {
//        return interestRate;
//    }     // Account 클래스의 필드값에 final을 걸면 게터/세터 자체가 생성되지 않음
}
