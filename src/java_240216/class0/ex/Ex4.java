package java_240216.class0.ex;

import JAVA_240213.loop.Loop3;

public class Ex4 {
    // 3번 연습문제를 리팩토링 해주세요.
    // createOrder 메소드를 통해 상품 주문 객체를 생성해주세요.
    // PrintOrder 메소드를 통해 상품 정보를 출력해주세요.
    // getTotalAmount 메소드를 통해 총 결제 금액을 구해주세요.
    public static void main(String[] args) {

        // 상품 주문 객체를 3개 생성
        ProdcutOrder prodcutOrder1 = createOrder("노트북", 1000000, 2);
        ProdcutOrder prodcutOrder2 = createOrder("마우스", 15000, 3);
        ProdcutOrder prodcutOrder3 = createOrder("키보드", 50000, 1);


        // 생성한 객체를 배열에 저장 (주의하기 -> 저장하지 않으면 배열을 사용할 수 없음)
        ProdcutOrder[] orders = {prodcutOrder1, prodcutOrder2, prodcutOrder3};

        // 객체 정보 출력
        System.out.println("주문상품 정보: ");
        printOrder(orders);

        // 최종 결제 금액 출력
        int totlaPayment = getTotalPayment(orders);
        System.out.println("총 결제금액: " + totlaPayment + "원");

    }

    // 생성 메서드
    public static ProdcutOrder createOrder(String name, int price, int quantity) {
        ProdcutOrder prodcutOrder = new ProdcutOrder();
        prodcutOrder.productName = name;
        prodcutOrder.productPrice = price;
        prodcutOrder.productQuantity = quantity;
        return prodcutOrder;

    }

    // 출력 메서드
    private static void printOrder(ProdcutOrder[] orders){
        for (ProdcutOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.productPrice
                    + ", 수량: " + order.productQuantity + "개");
        }

    }

    // 계산 메서드
    public static int getTotalPayment(ProdcutOrder[] orders) {
        int totalPayment = 0;
        for (ProdcutOrder order : orders) {
            totalPayment += order.productPrice * order.productQuantity;
        }
        return totalPayment;
    }
}
