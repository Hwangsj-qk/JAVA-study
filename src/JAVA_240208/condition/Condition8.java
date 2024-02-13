package JAVA_240208.condition;

public class Condition8 {
    public static void main(String[] args) {
        //주사위 던지기
        int diceNumber = (int) (Math.random() * 6) +1 ;
        // 1~6까지 랜덤한 난수 생성

        switch (diceNumber) {
            case 1:
                System.out.println("1번이 나왔습니다. ");
                break;
            case 2:
                System.out.println("2번이 나왔습니다. ");
                break;
            case 3:
                System.out.println("3번이 나왔습니다. ");
                break;
            case 4:
                System.out.println("4번이 나왔습니다. ");
                break;
            case 5:
                System.out.println("5번이 나왔습니다. ");
                break;
            default:
                System.out.println("6번이 나왔습니다. ");
                break;
        }

    }
}
