package java_240326.io_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOStream2 {
    // 바이트로 배열을 출력
    public static void main(String[] args) {

            try {
                OutputStream outputStream = new FileOutputStream("src/java_240326/io_stream/test2.txt");

                byte[] byteArray = {65, 66, 67};

                // 배열의 모든 바이트 출력 -> 정보를 배열값으로 한 번에 입력
                outputStream.write(byteArray);

                // 버퍼 비우기
                outputStream.flush();

                // 메모리 해제
                outputStream.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

    }
}
