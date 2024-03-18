package java_240318.lambda;

public class Lambda5 {
    public static void main(String[] args) {
        // 매개변수가 2개인 람다식(한 줄이면 중괄호, 리턴 삭제 가능)
        ParamTow add = (x, y) -> x + y;     // 순수 함수

        System.out.println("10 + 20  = " + add.func(10,20));

        // 본문이 여러 줄인 경우 => {} 추가,  return 필수
        ParamTow addAndPrint = (x, y) -> {
            int result = x + y;
            System.out.printf("%d + %d = %d \n" , x, y, result);
            return result;
        };

        addAndPrint.func(30,40);
    }
}
