package java_240326.io_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IOStream4 {
    public static void main(String[] args) throws IOException {
        // 바이트 배열로 읽기
        InputStream inputStream = new FileInputStream("src/java_240326/io_stream/test2.txt");

        // 최대 1024 바이트를 저장하는 바이트 배열 (1024바이트 = 1킬로바이트 -> 바이트가 크면 더 빨리 돌아가지만 그만큼 메모리 차지도 많아짐)
        byte [] buffer = new byte[1024];

        while (true) {
            // 최대 1024 바이트를 읽고, 매개변수 data(바이트 배열)에 읽은 바이트를 저장
            // 버퍼에서 읽어온 바이트 데이터를 number에 저장
            int number = inputStream.read(buffer);
            // 파일 끝에 도달하면 -1을 반환 -> 반복이 종료
            if(number == -1) break;

            // 읽은 바이트를 출력
            for (int i = 0; i < number; i++) {
                System.out.println(buffer[i]);
            }
        }
        // 메모리 해제
        inputStream.close();

    }
}
