package java_240305.library.lang;

public class MathClass {
    public static void main(String[] args) {
        // Math 클래스 : 수학 계산
        // 모든 메서드가 static 메서드
        double num1 = -10.5;
        double num2 = 4.5;

        System.out.println("절대값: " + Math.abs(num1));
        System.out.println("올림: " + Math.ceil(num1));
        System.out.println("내림: " + Math.floor(num1));
        System.out.println("최대값: " + Math.max(num1, num2));     // 최대 2개까지 비교 가능
        System.out.println("최소값: " + Math.min(num1, num2));     // 최대 2개까지 비교 가능
        // 첫번째 인자의 두번째 인사 승(제곱)
        System.out.println("제곱: " + Math.pow(4, 2));
        System.out.println("제곱근: " + Math.sqrt(16));
        // 0 ~ 1 까지 랜던 수 반환
        System.out.println("랜덤값: " + Math.random());
        System.out.println("반올림: " + Math.round(num2));
        System.out.println("사인: " + Math.sin(Math.PI /2));
        System.out.println("코사인: " + Math.cos(Math.PI /2));
        System.out.println("탄젠트: " + Math.tan(Math.PI /2));
        System.out.println("자연 로그: " + Math.log(Math.E));

        // 임의의 주사위 눈 얻기
        for (int i = 0; i < 10; i++) {
            int diceNum = (int) (Math.random() * 6) + 1;     // 인덱스처럼(0 ~ end -1)
            System.out.println("주사위 눈: " + diceNum);
        }



    }
}
