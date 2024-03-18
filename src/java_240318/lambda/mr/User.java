package java_240318.lambda.mr;

import java.util.function.BiFunction;
import java.util.function.Function;

public class User {
    // 메서드
    // 매개변수로 문자열 정보를 받아 Member 객체를 반환하는 메서드
    // 매개변수를 1개만 받는 상황
    public Member1 getMember1(Function<String, Member1>function) {
        String id = "spring";
        Member1 member = function.apply(id);
        return member;
    }

    // 매개변수 2개를 받는 상황
    public Member1 getMember2(BiFunction<String,String, Member1> function) {
        String id = "spring";
        String name = "봄봄";
        Member1 member = function.apply(id, name);
        return member;
    }
}
