package java_240227.solid.ocp.after;

// 새로운 결제 방법 확장에는 열러있다.
public class NavePayPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("네이브 페이 결제...");
    }
}
