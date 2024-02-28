package java_240226.polymorphism.interface0.ex.ex2;

public class MobilePay implements Payment{
    @Override
    public void pay(double payment) {
        System.out.println("모바일 결제로 " + payment + "월 결제되었습니다. ");
    }
}
