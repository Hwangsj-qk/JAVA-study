package java_240304.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Try10 {
    public static void main(String[] args) {
        // try with resources
        // 외부 자원을 사용하고 닫아주어야 할 경우
        // finally 구문에서 닫아주는 것을 간편화한 구문

        /*try (리소스 선언) {

        } catch (예외를 처리) {

        }finally {
            리소스 닫기
        } */

        try(FileInputStream fis = new FileInputStream("file.txt")) {
            // 파일 다루기
        }catch (IOException e) {
            // 예외 처리
        }
        // try - catch 구문이 종료됨과 동시에 리소스가 종료되어 리소스 누수 또는 메모리 누수를 막을 수 있다.


        // try with resource를 사용하지 않고 외부 자원 사용한 경우
        // 블록 변수 범위로 인해 외부에 변수 선언
        FileInputStream fileInputStream = null;
            try {
                // 파일 리소스 다룸
                fileInputStream = new FileInputStream("file.txt");
            } catch (FileNotFoundException e) {
                // 예외 처리
            } finally {

            }

    }
}
