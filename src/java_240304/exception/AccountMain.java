package java_240304.exception;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(1000);
        System.out.println("예금액: " + account.getBalace());

        // 떠넘겨진 예외(체크 예외)를 처리
        try {
            account.withdraw(5000);
        } catch (InsufficientException e) {
            // 예외의 메시지를 가져올 수 있다.
            System.out.println(e.getMessage());
        }
        System.out.println("현재 잔액:" + account.getBalace());
    }
}
