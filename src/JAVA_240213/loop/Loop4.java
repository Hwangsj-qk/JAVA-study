package JAVA_240213.loop;

public class Loop4 {
    public static void main(String[] args) {
        /* break문
        while (조건식) {
            code1
            break; -> 코드2를 실행하지 않고 반복문을 종료한다.
            code2
       }
         */
        int sum = 0;
        int i = 1;

        while (true) {  // 조건이 그냥 true이기 때문에 무한반복
            sum = sum + i;
            // 만약 i가 10보다 크다라는 조건을 만족하면 break문이 수행되고
            // while 문이 종료가 된다.
            if(i > 10) {
                System.out.println("sum = " + sum);
                break; // while문의 조건이 true일지라도 if문의 조건 이후에는 종료 (if문을 종료하는 것이 아니라 while문을 종료 시킴)
            }
            i++; // i가 하나씩 증가함(if문에 false로 걸리지 않으면 계속 1씩 더함)
        }
    }
}
