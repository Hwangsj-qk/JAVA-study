package java_240328.network.ex;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ex2 {
            /*
    연습문제 : 웹 페이지 제목 추출기

    주어진 URL의 웹 페이지로부터 HTML <title> 태그 내의 텍스트를 추출하는 자바 프로그램을 작성하세요.
    이 프로그램은 웹 페이지를 다운로드하고, HTML 내용에서 <title> 태그의 텍스트를 찾아 출력해야 합니다.

    - 웹 페이지의 HTML 내용을 가져옵니다.
    - HTML 내용에서 <title> 시작 태그와 </title> 종료 태그 사이의 텍스트를 추출합니다.
    - 추출한 텍스트를 출력합니다.

    - 입력 예시: https://www.example.com
    - 출력 예시 (웹 페이지의 제목에 따라 다름): Example Domain
     */
            public static void main(String[] args) throws IOException {
                URL url = new URL("https://www.busan.com/view/busan/view.php?code=2024032617183704502");

                // URL 연결 객체 반환 -> openConnection 을 해주지 않으면 InputStream로 받기 복잡해짐
                URLConnection connection = url.openConnection();

                // URL 연결 정보에서 입력 스트림으로 데이터를 받음.
                InputStream inputStream = connection.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


                // line을 읽으면서 <title> 찾아서 출력
                while (true) {
                    String line = bufferedReader.readLine();

                    if (line == null) break;
                    if (line.contains("<title>")) {
                        System.out.println(line);
                    }
                }

                // 닫을 땐 무조건 while문에 대한 break가 존재해야 함.
                bufferedReader.close();
                inputStream.close();
                inputStreamReader.close();





            }
}
