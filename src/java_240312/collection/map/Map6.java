package java_240312.collection.map;

import java.io.IOException;
import java.util.Properties;

public class Map6 {
    // Properites : Hashtable의 자식 클래스
    // Key, Value를 문자열 (String) 타입으로 제한한 컬렉션
    // 주로 확장자가 properties인 파일을 읽을 때

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        // 문자열만 들어갈 수 있음

        // Properties 컬렉션에 이 파일과 같은 위치에 있는 파일 로드하기
        properties.load(Map6.class.getResourceAsStream("database.properties"));

        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("username = " + username);
        // username = scott
        System.out.println("password = " + password);
        // password = tiger

    }
}
