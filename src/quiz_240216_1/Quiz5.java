package quiz_240216_1;

public class Quiz5 {
    public static void main(String[] args) {

        ProductOrder order1;
        order1 = new ProductOrder();
        order1.productName = "노트북";
        order1.price = 1000000;
        order1.quantity =2;

        ProductOrder order2;
        order2 = new ProductOrder();
        order2.productName = "마우스";
        order2.price = 15000;
        order2.quantity= 3;

        ProductOrder order3;
        order3 = new ProductOrder();
        order3.productName = "키보드";
        order3.price = 15000;
        order3.quantity = 1;

        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = order1;
        orders[1] = order2;
        orders[2] = order3;

        int totalPayment = 0;

        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price +
                    ", 수량: " + order.quantity);
            int payment = order.price * order.quantity;
            totalPayment = totalPayment + payment;

        }
        System.out.println("총 결제금액: " + totalPayment + "원");

        }



}
