package JAVA_240207.variable;

public class Var4 {
    public static void main(String[] args) {
        // 두 변수의 값 교환하기
        /*
        두 그릇의 내용물을 바꾸는 순서:
        A그릇: 10ml 물
        B그릇: 20ml 오렌지 주스가 있다.
        어떻게 하면 내용물을 바꿀 수 있을가?
         */
//        int a = 10;
//        int b = 20;
//        System.out.println("바뀌기 전 - " + "A그릇: " + a + "/" + "B그릇: " + b);

        int a = 10; // A 그릇 10
        int b = 20; // B 그릇 20
        int temp;   // 빈 그릇

        temp = a;   // 빈 그릇에 A그릇의 내용물을 10을 넣는다.
        a= b;   // B 그릇의 내용물으 A그릇으로 옮긴다.
        b= temp;    // 임시그릇(temp = a)의 내용물을 B그릇으로 옮긴다.
        System.out.println("바뀐 후 - " + "A그릇: " + a + "/" + "B그릇: " + b);
        System.out.println("temp = " + temp); // soutv 사용 예시


    }
}
