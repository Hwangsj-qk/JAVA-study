package java_240221.static0;

public class Static3 {
    public static void main(String[] args) {

        // 1. 객체 생성
//        StringDecoUtil util = new StringDecoUtil();
        // 2. 객체를 통해 메서드에 접근해서 사용 => 인스턴스 메서드 사용
//        System.out.println(util.decorate("안녕하세요"));

        // static 메서드 사용(객체 생성X) => 클래스 메서드
        System.out.println(StringDecoUtil.decorate("반갑습니다"));


    }
}
