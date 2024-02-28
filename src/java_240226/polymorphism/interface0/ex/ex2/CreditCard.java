package java_240226.polymorphism.interface0.ex.ex2;

public class CreditCard implements Payment{
    @Override
    public void pay(double payment) {
        System.out.println("신용카드로 " + payment + "원 결제되었습니다. ");
    }
}
