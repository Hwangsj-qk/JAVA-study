package java_240304.exception;

public class Account {
    private long balace;

    public Account() {}

    public long getBalace() {
        return balace;
    }
    public void deposit(int money) {
        balace += money;
    }
    // 예외를 떠넘김
    public void withdraw(int money) throws InsufficientException {
        // 잔액이 부족할 경우 출금되지 않는다.
        if(balace < money) {
            // 잔액이 부족하다라는 예외를 발생시킴
            throw new InsufficientException("잔고가 " + (money -balace) + "원 부족합니다. ");
        }
        balace -= money;
    }
}
