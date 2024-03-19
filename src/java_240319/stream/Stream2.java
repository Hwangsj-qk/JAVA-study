package java_240319.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream2 {
    // 리소스(자원)으로 스트림을 얻기(생성하기)
    public static void main(String[] args) throws IOException {
        // 1. 스트림 생성 :  컬렉션 프레임워크로부터 얻기
        List<String> fruitList = new ArrayList<>(
                List.of("사과", "오렌지", "청포도", "바나나")
        );

        // 1-1. Collection 인터페이스의 stream() 메서드
        Stream<String> stream = fruitList.stream();

        // 1-2. Stream.of 메서드를 활용 : 요소를 직접 나열하여 생성 가능
        Stream<String> colorStream = Stream.of("빨강", "주황", "노랑");

        // 1-3. Arrays.stream 메서드를 활용
        String[] array = {"냉장고", "세탁기" ,"건조기"};
        Stream<String> arrayStream = Arrays.stream(array);

        // 1-4. Stream.builder() 메서드 활용 (디자인 패턴 중 빌더 패턴 활용)
        Stream.Builder<String> builder = Stream.builder();
        Stream<String> builderStream = builder.add("옷")
                .add("신발")
                .add("바지")
                .build();

        // 1-5. Map에서 생성
        Map<String, Integer> scoreMap = new HashMap<>();
        scoreMap.put("홍길동", 80);
        scoreMap.put("임꺽정", 70);
        scoreMap.put("이몽룡", 90);
//        scoreMap.stream()     -> 안됨 => Collection 인터페이스가 아니라 직접 스트림 생성 불가

        Stream<Map.Entry<String, Integer>> entryStream = scoreMap.entrySet().stream();      // entry 값
        Set<String> keySetSteam = scoreMap.keySet();    // 키 값
        Stream<Integer> valueStream = scoreMap.values().stream();       // value 값

        // 반복자를 통한 생성 (무한 스트림)
        // 크기가 정해지지 않고, 계속해서 요소를 생성하는 스트림
        // seed: 0, UnaryOperator(람다식, 동일한 타입 리턴)
        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 1);

        // 무한스트림은 특정한 "제한"이 필요함
        Stream<Integer> limit = Stream.iterate(0, n -> n + 1)
                .limit(100);// 100개까지만 제한
        Object[] array1 = limit.toArray();      // 최조 연산시 수행
//        Object[] array2 = infiniteStream.toArray();     // 무한 스트림을 제한 없이 최종 연산 단계로 가지 않도록 주의

        // 기본 타입을 스트림으로 생성하기
        IntStream intStream = IntStream.range(0, 10);
        int[] array2 = intStream.toArray();
        IntStream rangeStream = IntStream.rangeClosed(1, 10);// 마지막 값 포함
        int[] array3 = rangeStream.toArray();

        // 기본타입을 포장타입으로 박싱
        Stream<Integer> boxedStream = IntStream.range(10,20).boxed();
        // 최종 연산을 한 번 한 뒤에는 같은 것을 계속 쓰지 못함(위에서 intstream 이 최종 연산을 했기 때문에 재사용 x)

        // Random 클래스에서 스트램 생성
        IntStream randomStream = new Random().ints(6, 1, 46);
        randomStream.forEach(n -> System.out.print(String.valueOf(n) + " "));

        DoubleStream doubleStream = new Random().doubles(5, 1, 10);
        double[] array4 = doubleStream.toArray();

        // 문자열을 char의 정수 스트림으로
        IntStream chars = "안녕하세요".chars();      // 유니코드 반환
        int[] array5 = chars.toArray();

        // 빈 스트림 생성
        Stream<Integer> emptyStream = Stream.empty();

        // 파일(Non block I/O)에서 스트림 생성하기
        Path path = Paths.get("src/java_240319/stream/stream.txt");
        Stream<String> lines = Files.lines(path);       // 파일을 불러올 때 오류가 발생할 수 있기 때문에 예외 처리 필요
        lines.forEach(System.out::println);



    }

}
