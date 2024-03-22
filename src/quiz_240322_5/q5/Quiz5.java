package quiz_240322_5.q5;

import java.util.function.Function;

public class Quiz5 {
    public static void main(String[] args) {


        Function<String, String> stringFunction = (s -> s.substring(0, 4) + "-" + s.substring(4, 6) +
                "-" + s.substring(6, 8));
        String result = stringFunction.apply("20240320");
        System.out.println(result);

    }
}
