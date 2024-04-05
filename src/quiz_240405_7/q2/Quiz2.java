package quiz_240405_7.q2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Quiz2 {
    public static void main(String[] args) {

        List<CoffeeOrder> orders = new ArrayList<>();

        orders.addAll(List.of(
                new CoffeeOrder("에스프레소", 2),
                new CoffeeOrder("아메리카노", 3),
                new CoffeeOrder("카푸치노", 5),
                new CoffeeOrder("라떼", 4)
        ));

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        orders.forEach(order ->
                executorService.execute(() -> {
                    Thread thread = Thread.currentThread();
                    String format = String.format("%s> %s 준비시작.", thread.getName(), order.coffeeName());

                    System.out.println(format);
                    try {
                        Thread.sleep(order.second()* 100);
                        String format1 = String.format("%s> %s 준비완료!", thread.getName(), order.coffeeName());

                        System.out.println(format1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                })

        );



    }


}

record CoffeeOrder(String coffeeName, int second) {}
