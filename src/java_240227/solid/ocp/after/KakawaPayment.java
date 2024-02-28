package java_240227.solid.ocp.after;

public class KakawaPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("카카와페이...");
    }
}
