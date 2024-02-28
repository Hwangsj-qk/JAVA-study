package java_240226.polymorphism.interface0.ex.ex2;

public class BankTransfer implements Payment{
    @Override
    public void pay(double payment) {
        System.out.println("은행 이체로 " + payment +"원 결제되었습니다.");
    }
}
