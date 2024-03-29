package quiz_240308_3.q1;

public class BankTransfer implements Payment{
    @Override
    public void pay(int price) {
        System.out.printf("은행 이체로 %d원이 결제되었습니다. \n", price);
    }
}
