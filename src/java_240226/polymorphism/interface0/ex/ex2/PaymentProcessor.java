package java_240226.polymorphism.interface0.ex.ex2;

public class PaymentProcessor {
    public static void main(String[] args) {
        Payment [] payments = { new CreditCard(), new BankTransfer(), new MobilePay()};

        payments[0].pay(10000);
        payments[1].pay(20000);
        payments[2].pay(15000);
    }
}
