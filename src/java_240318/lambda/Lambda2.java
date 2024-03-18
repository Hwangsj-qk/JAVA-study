package java_240318.lambda;

public class Lambda2 {
    public static void main(String[] args) {
        // 매개변수가 없고 반환값이 없는 람다식
        Printer anonymousPrinter = new Printer() {
            @Override
            public void print() {
                // 익명 객체 활용
                System.out.println("익명 객체에서 본문 선언하여 출력");
            }
        };

        anonymousPrinter.print();

        Printer lambdaPrint = () -> {
            // 한 줄짜리 식이라 굳이 중괄호가 필요 없음.
            System.out.println("람다식으로 본문 선언하여 출력");
        };
        lambdaPrint.print();

        Printer noReturnPrint = () -> System.out.println("중괄호 생략하고 리턴 값도 없는, 한줄짜리 람다식");

        noReturnPrint.print();

        Printer twoLinePrinter = () -> {
            System.out.println("여러 줄 있는 경우에는");
            System.out.println("본문 부분에 중괄호가 필요");
        };

        twoLinePrinter.print();
    }
}
