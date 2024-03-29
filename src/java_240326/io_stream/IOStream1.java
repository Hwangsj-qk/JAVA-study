package java_240326.io_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOStream1 {
    // 입출력 스트림
    // OutputStream : 바이트 기반 '출력' 스트림의 최상위 추상 클래스
    public static void main(String[] args) {
        // "test.txt"를 도착지로 하는 바이트 출력 스트림을 생성
        // OutputStream outputStream = newFileOutStream("test.txt")
        // outputStream은 바이트 기반 "출력" 스트림의 최상위 클래스 : 내보내는 기능

        // 도착지 경로를 설정(절대경로 또는 상대경로)하면 해당 위치로 파일 생성
        try {
            OutputStream outputStream = new FileOutputStream("src/java_240326/io_stream/test1.txt");
            byte b1 = 65;
            byte b2 = 66;
            byte b3 = 67;

            // 1 바이트씩 출력 : 해당 데이터가 파일에 입력됨
            outputStream.write(b1);
            outputStream.write(b2);
            outputStream.write(b3);
            // write 메서드가 호출 되면, 버퍼에 바이트를 먼저 저장
            // 버퍼가 차면 순서대로 바이트 출력

            // flush : 내부 버퍼에 잔류하는 바이트 들을 비움
            outputStream.flush();

            // 스트림을 닫아서 메모리 해제
            outputStream.close();
            // 클로즈를 해주어야 파일에 정보가 완전히 입력됨

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
