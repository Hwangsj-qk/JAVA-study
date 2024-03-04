package java_240304.exception;

public class InsufficientException extends Exception {

    // 기본 생성자
    public void InputMismatchException() {

    }

    // 메시지를 매개변수로 가지는 생성자
    public InsufficientException(String message) {
        super(message);
    }

}
