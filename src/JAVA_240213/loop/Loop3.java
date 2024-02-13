package JAVA_240213.loop;

public class Loop3 {
    public static void main(String[] args) {
        /* do - while문, while문과 유사하지만, 무조건 한 번은 코드를 실행한다.
        do {
             반복할 코드
        } while (조건식);
         */
        int i = 10;
        // do - while문의 경우 최소 한 번은 코드블럭을 실행한다.
        do {
            System.out.println("i = " + i);
            i++;
        } while( i < 5) ;
// 조건이 false라고 해도 적어도 무조건 한 번은 실행해서 값이 나오게 됨. 반면 일반 while문의 경우 조건이 false라면 아무것도 출력하지 않음

        System.out.println("=============");
        // 일반 while문의 경우 처음부터 false 조건을 만나면 아무 것도 출력하지 않는다.
        i = 10;
        while (i< 5) {
            System.out.println("i = " + i);
            i ++;
        }

    }
}
