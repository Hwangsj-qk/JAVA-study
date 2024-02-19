package java_240219.Class1;

public class Constructor2 {
    public static void main(String[] args) {

        Member member = new Member("홍길동", 80, 30);
        Member member1 = new Member("이순신", 100, 35);
        Member member2 = new Member("임꺽정", 90, 40);
        Member member3 = new Member("이몽룡", 60, 25);
//        Member member4 = new Member();       // 생성자가 존재할 대, 입력밧이 없는 생성자를 호출하면 컴파일 에러 발생 -> 런타임 오류 원천 차단(NPE)
        Member member4 = new Member("심청이");     // 성적: 50, 나이: 0으로 출력됨.
        Member [] members = {member1, member2, member, member3, member4};
        for (Member m : members) {
            System.out.println("이름: " + m.name + " 성적: " + m.score + " 나이: " + m.age);

        }

    }
}
