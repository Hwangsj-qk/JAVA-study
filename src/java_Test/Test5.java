package java_Test;

import com.sun.security.jgss.GSSUtil;

import java.io.OutputStream;

public class Test5 {
    public static void main(String[] args) {
        ProductOrder order1 = new ProductOrder();
        order1.productName = "노트북";
        order1.price = 1000000;
        order1.quantity = 2;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "마우스";
        order2.price = 15000;
        order2.quantity = 3;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "키보드";
        order3.price = 50000;
        order3.quantity = 1;

        System.out.println("상품 주문 정보:");
        order1.printOrder();
        order2.printOrder();
        order3.printOrder();

        ProductOrder[] productOrders = {order1, order2, order3};
        int totalPayment = 0;
        for (int i = 0; i < productOrders.length; i++) {
            int payment = 0;
            payment = productOrders[i].getTotalPayment();
            totalPayment += payment;
        }
        System.out.println("총 결제금액: " + totalPayment);
    }
}


