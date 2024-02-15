package JAVA_240207.variable;

public class VarScope { // 클래스 블록(자바는 무조건 클래스를 깔고 들어감
    public static void main(String[] args) {    // 메소드 블록
        // 변수의 사용범위
        // 자바의 모든 변수는 중괄호 블록 내에서 선언되고 사용됨
        // 해당 블록을 벗어나면 선언된 변수가 소멸됨
        int value = 10;     // 지역(local) 변수
        System.out.println(value);
        // 변수는 블록 내에서 어디서나 선언할 수 있지만, 사용할 때는 자신이 선언된 위치로부터 자신이 속한 블록 내부(중괄호 안)에서만 사용가능
        // 메소드 안에서도 또 다른 변수를 생성할 수 있다.
        // 해당 블록을 벗어나면 선언된 변수는 소멸
        value = 20;
        System.out.println(value);

        if (value > 10) {
            int localVal = 30;
            // 바깥 블록에서 선언된 변수는 내부에서 사용 가능
        }
    }
//    value <- 블록을 벗어나면 사용할 수 없다.
}
