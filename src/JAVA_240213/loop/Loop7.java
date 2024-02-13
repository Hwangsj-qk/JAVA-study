package JAVA_240213.loop;

public class Loop7 {
    public static void main(String[] args) {
        // 1부터 10까지 합계를 더하는 for문 작성
        
        int sum =0;
        for (int i = 1; i <= 10; i ++) {
            sum += i;
            System.out.println("sum = " + sum); // 더하는 과정을 모두 보여줌
        }
//        System.out.println("sum = " + sum); // 마지막 최종 합계만 보여줌

        // while문과 동일한 구조를 갖지만, 반복되는 코드에 집중할 수 있고 깔끔하게 볼 수 있다.
    }
}
