package quiz_240401_6.q3;

import java.util.Arrays;
import java.util.List;

public class Quiz3 {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(16, -9, 4, 1, -16, 9, 25);

        scores.stream()
                .filter(number -> number > 0)
                .forEach(number -> System.out.println(Math.sqrt(number)));
    }
}
