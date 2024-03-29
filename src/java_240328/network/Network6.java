package java_240328.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Network6 {
    public static void main(String[] args) {
        // JSON POST 메서드 요청하기 (가상 데이터 생성 예제)
        String urlString = "https://jsonplaceholder.typicode.com/";

        // 데이터를 담을 공간 생성
        StringBuilder response = new StringBuilder();

        try {
            // URL로부터 HTTP 연결 객체 생성
            URL url = new URL(urlString + "posts");
            HttpURLConnection connection =(HttpURLConnection) url.openConnection();

            // 메서드 설정
            connection.setRequestMethod("POST");        // POST: 서버에 데이터를 생성하거나 업데이트할 때 사용

            // 헤더 추가 설정 : 받는 데이터의 타입이 JSON
            connection.setRequestProperty("Content-Type", "application/json");

            // 출력 스트림을 true로 설정
            connection.setDoOutput(true);

            // 본문에 데이터를 담아서 보냄 (서버의 규격에 맞게 보내야함)
            String jsonString = "{\"title\": \"hello\", \"body\": \"java\", \"userId\": 1}";

            // 응답 코드: 응답 상태코드 (Status Code) -> 데이터가 생성되었음을 반환
            int responseCode = connection.getResponseCode();
            System.out.println("responseCode = " + responseCode);
            // responseCode = 2xx (알맞게 가져옴) or 404 => 잘못 가져옴
            String responseMessage = connection.getResponseMessage();
            System.out.println(responseMessage);

            // 성공적으로 응답되었을 때 JSON 분문을 문자열에 넣어 저장
            if(responseCode == 200) {       // StatusCode = 2xx -> (성공) 요청을 성공적으로 받았음.
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                while (true) {
                    String line = in.readLine();
                    if(line == null) break;
                    // 읽어온 라인을 response에 입력
                    response.append(line.trim());
                }
                in.close();
            }

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("응답 본문");
        System.out.println(response);

    }
}
