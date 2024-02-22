package test1_practice;

public class Item {
    private String name;
    private long price;
    private int quantity;

    public Item (String name, long price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    // 합계 구하기: 가격 * 수량
    public long getTotal() {
        return price * quantity;
    }
}
