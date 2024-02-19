package java_240216.class0.ex;

public class Ex3 {
    public static void main(String[] args) {

        ProdcutOrder order1;
        order1 = new ProdcutOrder();
        order1.productName = "노트북";
        order1.productPrice = 1000000;
        order1.productQuantity = 2;

        ProdcutOrder order2;
        order2 = new ProdcutOrder();
        order2.productName = "마우스";
        order2.productPrice = 15000;
        order2.productQuantity = 3;

        ProdcutOrder order3;
        order3 = new ProdcutOrder();
        order3.productName = "키보드";
        order3.productPrice = 50000;
        order3.productQuantity = 1;

        System.out.println("주문상품 정보: ");

        ProdcutOrder[] orders = new ProdcutOrder[3];
        orders[0] = order1;
        orders[1] = order2;
        orders[2] = order3;
        
        int totalPayment = 0;     // 총 결제금액을 저장할 수 있는 변수


        for (ProdcutOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.productPrice +
                    "원, 수량: " + order.productQuantity + "개");
            int payment = order.productPrice * order.productQuantity;
            totalPayment += payment;
            
        }

        // 최종 결제 금액 출력
        System.out.println("총 결제금액: " + totalPayment + "원");
    }
}
