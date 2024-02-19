package java_240219.Class0;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();


        bankAccount.clientData();

        Scanner scanner = new Scanner(System.in);

        System.out.print("원하는 서비스를 입력하세요: ");
        String service = scanner.nextLine();

        boolean process = false;



       switch (service) {
           case "입금":
                bankAccount.deposit();
                break;

           case "출금" :
               bankAccount.withdraw();
               break;
           case "잔액조회" :
               bankAccount.getBalance();
               break;
           default:
               System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. ");
       }
// 나중에 선생님 파일과 비교하기

    }
}
