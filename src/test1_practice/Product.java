package test1_practice;

public class Product {
    /*
    ProductOrder 클래스를 생성하고,
상품명, 가격, 주문수량 필드를 만든다.
productName, price, quantity

상품, 가격, 수량을 3개 담아서
총 결제금액을 계산하는 프로그램을 만들어보세요.
     */
    public static void main(String[] args) {
        ProdctOrder order1 = new ProdctOrder();
        order1.productName = "노트북";
        order1.price = 1000000;
        order1.quantity = 2;

        ProdctOrder order2 = new ProdctOrder();
        order2.productName = "마우스";
        order2.price = 15000;
        order2.quantity = 3;

        ProdctOrder order3 = new ProdctOrder();
        order3.productName = "키보드";
        order3.price = 50000;
        order3.quantity = 1;

        int totalPayment = 0;

        ProdctOrder [] prodctOrders = {order1, order2, order3};

        System.out.println("주문 상품 정보: ");

        for (ProdctOrder prodctOrder : prodctOrders) {
            System.out.println("상품명: " + prodctOrder.productName + ", 가격: " + prodctOrder.price+
                    "원, 수량: "+ prodctOrder.quantity + "개");

            int payment = prodctOrder.price * prodctOrder.quantity;
            totalPayment += payment;
        }


        System.out.println("총 결제금액: " + totalPayment + "원");
    }
}
