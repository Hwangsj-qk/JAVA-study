package java_240318.lambda.mr;

public class ConstructorReference {
    public static void main(String[] args) {
        // 생성자 참조 => 객체를 생성하고 리턴하도록 단순하게 구성도니 경우
        // 람다식을 생성자 참조로 대치할 수 있음.
        // 람다식
//        (a,b) -> {return new 클래스(a,b)}
        // 생성자 참조
//        클래스 이름::new

        User user = new User();

        // 람다식으로 매개변수 자리에 객체 생성 리턴
        Member1 member1 = user.getMember1((id) -> new Member1(id));
        Member1 member2 = user.getMember2((id, name) -> new Member1(id, name));

        // 메서드 참조로 변경할 경우
        Member1 member3 = user.getMember1(Member1::new);
        Member1 member4 = user.getMember2(Member1::new);

        System.out.println(member1);
        System.out.println(member2);

    }
}
