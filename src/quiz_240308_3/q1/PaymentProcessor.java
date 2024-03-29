package quiz_240308_3.q1;

public class PaymentProcessor {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.pay(10000);
        BankTransfer bankTransfer = new BankTransfer();
        bankTransfer.pay(1000);
        MobilePay mobilePay = new MobilePay();
        mobilePay.pay(10000);
    }
}
