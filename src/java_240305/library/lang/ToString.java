package java_240305.library.lang;

public class ToString {
    public static void main(String[] args) {


        Product product = new Product("바나나", 3000, "식품류");
        System.out.println(product);
    }
}

class Product {
    private String productName;
    private long price;
    private String category;

    public Product(String productName, long price, String category){
        this.productName = productName;
        this.price = price;
        this.category = category;

    }
    //마법사를 통해 필드 데이터 쉽게 생성 가능
    @Override
    public String toString() {
        return
                "제품명: " + productName + '\'' +
                ", 가격: " + price +
                ", 카테고리: " + category + '\''
                ;
    }
}
