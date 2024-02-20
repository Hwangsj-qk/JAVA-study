package java_240220.com.bank.system;

public class Ex2_Account {
    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(100000);
        account.deposit(1000);
        account.getBalance();
        account.withdraw(20000);
        account.withdraw(100000000);

    }
}
