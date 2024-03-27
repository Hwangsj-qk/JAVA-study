package java_240326.io_stream.serial;

import java.io.*;

public class Serial1 {
    // 객체는 문자가 아니기 대문에 바이트 기반 스트림으로 출력
    // 객체를 출력하기 위해서 객체의 데이터(필드값)을 일렬로 늘어선 연속적인 바이트로 변경 : 객체 직렬화
    // 객체의 입출력 => ObjectOutputStream, ObjectInputStream 활용
    public static void main(String[] args) throws IOException {
        // 파일 경로 지정
        String filePath = "src/java_240326/io_stream/serial/Person.ser";

        // 객체 생성
        Person person = new Person("홍길동", 30, 180, false, 70,
                new Career("조선 컴퍼니", 10));

        try (
                FileOutputStream fos = new FileOutputStream(filePath);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                ObjectOutputStream oos = new ObjectOutputStream(bos);
                // Object 타입이므로 ObjectOutputStream 사용
        ) {
            oos.writeObject(person);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
