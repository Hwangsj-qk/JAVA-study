package java_240326.io_stream;

import java.io.*;

public class IOStream10 {
    public static void main(String[] args) throws IOException {
        // 문자열 버퍼 스트림
        // 내부적으로 성능 향성 + newLine 메서드를 제공
        // newLine 메서드를 제공
        String src = "src/java_240326/io_stream/linetext.txt";
        BufferedWriter bw = new BufferedWriter(new FileWriter(src));


        bw.write("안녕하세요");
        bw.newLine();       // 줄 구분
        bw.write("반갑습니다. ");

        bw.close();
        // close 안해주면 값이 입력이 안된다.

        // readLine 메서드를 제공
        BufferedReader br = new BufferedReader(new FileReader(src));
        while (true) {
            String line = br.readLine();    // 파일에서 한 줄씩 읽음
            // 더 이상 읽을 내용이 없으면 null 리턴
            if(line == null) break;
            System.out.println(line);
        }
        br.close();
    }
}
