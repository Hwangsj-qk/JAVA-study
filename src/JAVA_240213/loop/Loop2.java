package JAVA_240213.loop;

public class Loop2 {
    public static void main(String[] args) {
        // 1부터 하나씩 증가하는 수를 더하기 1+2+3+4 ...
        /*
        int sum = 0;
        int i = 1; // 원하는 숫자만 넣으면 가능


        sum = sum + i;  // 0 + 1
        System.out.println("sum = " + sum);
        i++; // i = 1+1 = 2
        */

        int sum = 0;
        int i = 5;
        int end = 10;

        // 반복문을 사용하게 될 경우, 반복 횟수와 요구 조건을 유연하게 변경할 수 있다.
        while (i <= end) {
            sum = sum +i;
            System.out.println("sum= " + sum);
            i++;
        }
    }
}
