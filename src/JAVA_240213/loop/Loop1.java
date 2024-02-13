package JAVA_240213.loop;

public class Loop1 {
    public static void main(String[] args) {
        /* 반복문 while
        while (조건식) {
            조건식이 true일 때 반복할 코드
            조건식이 거짓이 되면 while문을 벗어난다.
            조건식이 false가 되는 조건이 없으면 무한 반복
        }
         */

        int count = 0; //초기값

        while (count < 100) {  //조건식 -> 종료 조건을 주지 않으면 계속 반복
            count++; // count 숫자 하나씩 증가(증감식)
            System.out.println("count = " + count);


        }




    }
}
