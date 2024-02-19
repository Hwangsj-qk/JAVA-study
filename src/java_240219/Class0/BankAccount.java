package java_240219.Class0;

import java.util.Scanner;

public class BankAccount {

        String accountNumber;
        String ownerName;
        int balance = 100_000;

        Scanner scanner = new Scanner(System.in);

        void clientData() {
            System.out.print("계좌번호를 입력하세요: ");
            accountNumber = scanner.nextLine();

            System.out.print("이름을 입력하세요: ");
            ownerName = scanner.nextLine();
        }

        // 입금
        void deposit() {
            System.out.print("입금할 금액을 입력하세요: ");
            int add = scanner.nextInt();
            System.out.println("잔액: " + balance + add);
    }
    void withdraw () {
        System.out.print("출금할 금액을 입력하세요: ");
        int stract = scanner.nextInt();
        System.out.println("잔액: " + (balance - stract));
    }

    void getBalance() {
        System.out.println("현재 잔액을 출력합니다.");
        System.out.println("현재 잔액: " + balance);
    }
}
