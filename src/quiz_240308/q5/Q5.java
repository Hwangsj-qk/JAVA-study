package quiz_240308.q5;



public class Q5 {


    private String name;

    public static void main(String[] args) {
        Product product1 = new Product("Apple", 2.5, 10);
        Product product2 = new Product("Apple", 2.5, 10);

        System.out.println("equals 메서드 호출 결과: " + product1.equals(product2));
        System.out.println("hashCode 메서드 호출 결과 (product1): " + product1.hashCode());
        System.out.println("hashCode 메서드 호출 결과 (product2): " + product2.hashCode());
        System.out.println("toString 메서드 호출 결과 (product1): " + product1.toString());
        System.out.println("toString 메서드 호출 결과 (product2): " + product2.toString());




    }
}

class Product {
    private String name;
    private double price;
    private int quantity;


    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


        // 메서드

        @Override
        public String toString() {
            return "상품: " + name + ", 가격: " + price  + ", 수량: " + quantity;

        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;

            if(obj == null) return false;

            if(getClass() != obj.getClass()) return false;


            return ((Product)obj).name.equals(name) && price == ((Product)obj).price && quantity == ((Product)obj).quantity;
        }
    }








