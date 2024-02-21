package java_240221.ex;

public class Ex1 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1, 100000);
        System.out.println("계좌 " + BankAccount.count + ": 계좌 ID= "
                + bankAccount.getAccountId() + " 잔액= " + bankAccount.getBalance());
        BankAccount bankAccount1 = new BankAccount(2, 200000);
        System.out.println("계좌 " + BankAccount.count + ": 계좌 ID= "
                + bankAccount.getAccountId() + " 잔액= " + bankAccount.getBalance());

        System.out.println("전체 계좌 수: " + BankAccount.count);

    }

}
