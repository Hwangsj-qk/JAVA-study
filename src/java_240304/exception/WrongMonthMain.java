package java_240304.exception;

public class WrongMonthMain {
    public static void main(String[] args) {
        setMonth(13);
        setMonth(10);
        setMonth(3);
        // unchecked: 컴파일러에서 예외처리를 강제하지 않는다.

    }

    private static void setMonth(int month) {
        if(month < 1 | month > 12) {
            throw new WrongMonthException(month);
            // 예외가 발생하면 아래 코드들은 수행되지 않는다. (return이나 else문 사용 안해도 됨) - RuntimeException이기 때문
            // 만약 에러 없이 다음 코드를 실행하고 싶다면 try - catch 구문 사용하면 됨.
        }
        System.out.println(month + "월로 설정되었습니다.");
    }
}
