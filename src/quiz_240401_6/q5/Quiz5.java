package quiz_240401_6.q5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Quiz5 {
    public static void main(String[] args) {

        List<ProductReview> reviews = Arrays.asList(
                new ProductReview("product1", 5),
                new ProductReview("product2", 4),
                new ProductReview("product3", 5),
                new ProductReview("product4", 3),
                new ProductReview("product1", 4)
        );

        int [] reviewNumber = new int[reviews.size()];
        for (int i = 0; i < reviews.size(); i++) {
            reviewNumber[i] = reviews.get(i).review;
        }

        Double average = Arrays.stream(reviewNumber).average().getAsDouble();

        System.out.println("평균 리부 점수: " + average);

        long count = Arrays.stream(reviewNumber)
                .filter(n -> n == 5).count();

        System.out.println("5점 리뷰 수: " + count);
    }

    static class ProductReview {
        String productName;
        int review;

        public ProductReview(String productName, int review) {
            this.productName = productName;
            this.review = review;
        }
    }
}

