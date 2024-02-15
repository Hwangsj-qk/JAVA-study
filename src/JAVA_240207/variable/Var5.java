package JAVA_240207.variable;

public class Var5 {
    public static void main(String[] args) {
        /*
        변수 이름 짓는 규칙(규칙을 지키지 않으면 컴파일 에러 발생)
        - 변수 이름은 숫자로 시작할 수 없다. 하지만 숫자를 포함한 것은 가능
        - 공백이 들어갈 수 없다. -> 문제점 해결을 위해 camelCase(낙타등 표기법) 활용
          -> 공백 이후 등장하는 단어는 대문자로 변환 (int orderDtail;)
        - 예약어를 사용할 수 없다. (public, int, void, class 등)
        - 변수 이름에는 영문자, 숫자, $, _를 사용한다.
         */
        /*
        변수 명명 관례
        - 자바에서 클래스 이름의 첫글자는 대문자로 시작한다.
        - 클래스를 제외한 나머지는 모두 첫글자를 소문자로 시작한다. (대문자로 시작하면 무조건 클래스명임)
          * 예외: 상수는 모두 대문자를 사용하고 언더바로 구분한다.
                 -> USER_LMIT, PI: 절대 변하지 않는 수 (변수의 반댓말)
        - 패키지 이름은 모두 소문자를 사용한다.
         */
        /*
        - 변수 이름은 의미를 명확하게 전달해야 한다.
        - 용도를 설명할 수 있어야 한다.
         */
        int a;  // 단순 예제 시에만 사용(학습용) -> 이렇게 변수명을 설정하면 변수가 뭔지 모름(이름만 봐도 용도를 알 수 있도록 설정)

    }
}
