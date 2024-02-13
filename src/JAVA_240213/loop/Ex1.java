package JAVA_240213.loop;

public class Ex1 {
    public static void main(String[] args) {
        // 반복문을 이용해서 20이내의 짝수를 출력해주세요

        for (int i = 1; i < 20; i++) {
            // 증감식의 경우 1씩 증가 대신 다른 증감대입 가능(i+ = 2)
            if(i % 2 == 0) {
                System.out.println("i = " + i);
            }


        }
    }
}
