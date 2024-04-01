package quiz_240401_6.q2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Quiz2 {

    public static void main(String[] args) {
        Map<String, Integer> userScores = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요: ");
            String name = scanner.next();
            if(name.equals("q")) break;
            System.out.print("점수를 입력하세요: ");
            int score = scanner.nextInt();


            userScores.put(name,score);

        }


        BiFunction<String, Integer, String> biFunction =
        (name, score) -> (score >= 50) ? name + ": 합격" : name + ": 불합격";

        for (String name : userScores.keySet()) {
            String result = biFunction.apply(name, userScores.get(name));
            System.out.println(result );
        }


    }

}
