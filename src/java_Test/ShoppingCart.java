package java_Test;

public class ShoppingCart {
    Item [] items = new Item[10];
    int count = 0;


    public void addItem(Item item) {
        count++;
        if (count > 9) {
            System.out.println("장바구니가 가득 찼습니다. ");
        }
    }

    public void displayItems() {
        long totalPayment = 0;
        for (int i = 0; i < items.length; i++) {
            long total = items[i].price * items[i].quantity;
            System.out.println("상품명: " + items[i].productName + ", 합계: " + total );
            totalPayment += total;
        }
        System.out.println("전체 가격 합: " + totalPayment);
    }


}
