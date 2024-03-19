package java_240319.stream.ex;

import java.util.Map;
import java.util.stream.Stream;

public class Ex4 {
    /*
        문제 4: 영화 평점 요약
    영화와 그에 대한 평점이 주어졌을 때, 평점이 8 이상인 영화의 이름을 추출하고,
    "영화명 - 평점" 형태로 변환한 후 결과를 출력하세요.

    Map<String, Integer> movieRatings = Map.of("The Shawshank Redemption",
     9, "The Godfather", 9, "The Dark Knight", 8, "Pulp Fiction", 8, "Fight Club", 7);

    출력 결과:
    The Shawshank Redemption - 9
    The Godfather - 9
    The Dark Knight - 8
    Pulp Fiction - 8
     */
    public static void main(String[] args) {
        Map<String, Integer> movieRatings = Map.of("The Shawshank Redemption", 9,
                "The Godfather", 9, "The Dark Knight",
                8, "Pulp Fiction", 8, "Fight Club", 7);

        //Stream<Integer> integerStream = movieRatings.values().stream()
          //      .filter(n -> n >= 8);
        //integerStream
          //      .forEach();

        movieRatings.keySet().stream()
                .filter(n -> movieRatings.get(n) >= 8)
                .map(title -> title + " - " + movieRatings.get(title))
                .forEach(System.out::println);


    }
}
