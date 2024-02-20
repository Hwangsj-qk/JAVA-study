package java_240208.condition;

public class Condition5 {
    public static void main(String[] args) {
        int score = 99;

        // 점수가 90 이상이면 A, 80 이상이면 B, 70 이상이면 C, 70 미만이면 D

        if (score >= 90) {
            System.out.println("등급: " + "A");
        } else if (score >= 80) {
            System.out.println("등급: B");
        } else if (score >= 70) {
            System.out.println("등급: C");
        } else {
            System.out.println("등급: D");
        }
    }
}
