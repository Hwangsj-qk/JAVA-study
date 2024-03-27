package java_240326.io_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOStream3 {
    public static void main(String[] args) {
        // 1바이트씩 읽기
        try {
            InputStream inputStream = new FileInputStream("src/java_240326/io_stream/test1.txt");
            // test1 파일에는 데이터가 입력(ABC)가 입력되어 있음

            // 1바이트씩 읽음 -> 문자열을 다시 바이트로 읽어오기
            int read1 = inputStream.read();
            int read2 = inputStream.read();
            int read3 = inputStream.read();
            // 더이상 읽을 바이트가 없으면 -1 반환
            int read4 = inputStream.read();

            System.out.println("read1 = " + read1);
            System.out.println("read2 = " + read2);
            System.out.println("read3 = " + read3);
            System.out.println("read4 = " + read4);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
