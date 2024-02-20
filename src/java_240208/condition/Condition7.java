package java_240208.condition;

public class Condition7 {
    public static void main(String[] args) {
        // 주사위 던지기
        int diceNumber = (int) (Math.random() * 6) + 1;
        // 1~6까지 랜던함 난수 생성(0번지 부터 시작인듯)

        if(diceNumber == 1) {
            System.out.println("주사위 1번입니다. ");
        } else if(diceNumber == 2) {
            System.out.println("주사위 2번입니다.");
        } else if (diceNumber == 3) {
            System.out.println("주사위 3번입니다. ");
        } else if (diceNumber == 4) {
            System.out.println("주사위 4번입니다. ");
        } else if (diceNumber == 5) {
            System.out.println("주사위 5번입니다. ");
        } else {
            System.out.println("주사위 6번입니다. ");
        }
    }
}
