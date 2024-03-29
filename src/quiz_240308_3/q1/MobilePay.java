package quiz_240308_3.q1;

public class MobilePay implements  Payment{
    @Override
    public void pay(int price) {
        System.out.printf("모바일 결제로 %d원이 결제되었습니다. \n",price);
    }
}
