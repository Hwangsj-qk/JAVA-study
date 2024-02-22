package java_240221.ex;

import java_240220.access_modifier.first.A;

public class Account {
    // 필드
    private String accountNumber;
    String ownerName;
    int balance;
    public final static double interestRate = 3.0;

    // 생성자
    Account(String accountNumber, String ownerName, int balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // 메서드
    public void printInfo() {
        this.accountNumber = accountNumber;
        System.out.println(accountNumber);
        System.out.println(ownerName);
        System.out.println(balance);
        System.out.println(interestRate);
    }


//    public double getInterestRate() {
//        return interestRate;
//    }     // Account 클래스의 필드값에 final을 걸면 게터/세터 자체가 생성되지 않음
}
