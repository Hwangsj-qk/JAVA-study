package java_240312.collection.set.ex;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex3 {
        /*
    연습문제: 로또 번호 생성기

    1부터 45까지의 숫자 중에서 6개의 숫자를 추출합니다.
    HashSet을 활용하여 중복되지 않는 로또 번호 6개를 무작위로 생성하는 간단한 번호 생성기를 구현합니다.

    요구 사항
    - 1부터 45까지의 숫자 중에서 무작위로 6개의 숫자를 선택합니다.
    - 선택된 숫자는 중복되면 안 됩니다.
    - 6개의 숫자를 모두 선택한 후, 선택된 숫자들을 출력합니다.

    출력 예시
    ===
    로또 번호: [5, 12, 23, 25, 33, 42]

    Hint : Random 객체 사용
     */

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        //numbers.add(random.nextInt(45) + 1);
        //numbers.add(random.nextInt(45) + 1);
        //numbers.add(random.nextInt(45) + 1);
        //numbers.add(random.nextInt(45) + 1);
        //numbers.add(random.nextInt(45) + 1);
        //numbers.add(random.nextInt(45) + 1);

        // 반복문 활용 (중복 없이 활용)
        while (numbers.size() < 6) {
            numbers.add(random.nextInt(45) + 1);
        }
        System.out.println("로또 번호: " + numbers);
    }
}
