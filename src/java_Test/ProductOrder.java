package java_Test;

public class ProductOrder {
    String productName;
    long price;

    int quantity;

    public void printOrder() {
        System.out.println("상품명: " + productName + ", 가격: " + price + "원, 수량: "
                + quantity + "개");

    }
    public int getTotalPayment() {
        return (int) price * quantity;
    }

}
