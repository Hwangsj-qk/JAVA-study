package java_240305.library.lang.ex1;

public class BankAccount {
    public static void main(String[] args) {
        Bank bank = new Bank("1234-5667-90", "홍길동", 100000);
        System.out.println(bank);
    }

}
class Bank{
    String accountNumber;
    String name;
    long balance;

    public Bank(String accountNumber, String name, long balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "계죄번호: %s, 이름: %s, 잔액: %d".formatted(accountNumber,name,balance);
    }
}
