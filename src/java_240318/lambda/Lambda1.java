package java_240318.lambda;

public class Lambda1 {
    public static void main(String[] args) {
        // 익명 함수 활용해서 익명 객체 생성
        action(new Calculable() {
            @Override
            public void calculate(int x, int y) {
                int result = x + y;
                System.out.println(result);     // 14
            }
        });

        // 람다식으로 변경 => 매개변수가 2개고 리턴값이 없는 람다식
        action((x, y) -> {
            int result = x * y;
            System.out.println(result);     // 40
        });

        action((x, y) -> {
            int result = x - y;
            System.out.println(result);      // 6
        });


    }

    // 매개변수에 참수형 인터페이스를 사용한 메서드
    static void action(Calculable calculable) {
        int x = 10;
        int y = 4;
        calculable.calculate(10,4);

    }
}
