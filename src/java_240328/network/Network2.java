package java_240328.network;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Network2 {
    public static void main(String[] args) throws URISyntaxException, MalformedURLException {
        // 문자열로부터 URI 객체 생성
        URI uri = new URI("https://search.kyobobook.co.kr/search?keyword=%EC%9D%B4%EA%B8%B0%EC%A0%81%20%EA%B2%BD%EC%98%81%EC%A0%95%EB%B3%B4&gbCode=TOT&target=total");

        // URI 메타 정보 조회하기
        String scheme = uri.getScheme();
        System.out.println("scheme = " + scheme);

        String host = uri.getHost();
        System.out.println("host = " + host);

        String path = uri.getPath();
        System.out.println("path = " + path);

        String query = uri.getQuery();
        System.out.println("query = " + query);

        String fragment = uri.getFragment();
        System.out.println("fragment = " + fragment);
        // fragment = null -> fragment가 없는 상태

        int port = uri.getPort();
        System.out.println("port = " + port);
        // port = -1 => port가 없는 상태

        // URI를 문자열 또는 URI 객체로 변환
        String uriString = uri.toASCIIString();
        System.out.println("uriString = " + uriString);

        URL url = uri.toURL();
        System.out.println("url = " + url);

        // URL 객체 : URI의 구조처럼 가지고 올 수 있음
        URL url1 = new URL("https://search.kyobobook.co.kr/search?keyword=%EC%9D%B4%EA%B8%B0%E" +
                "C%A0%81%20%EA%B2%BD%EC%98%81%EC%A0%95%EB%B3%B4&gbCode=TOT&target=total");
        // 형식에 맞지 않는 문자열을 사용할 경우 : MalformedURLException

        String externalForm = url.toExternalForm();
        System.out.println("externalForm = " + externalForm);

        String protocol = url.getProtocol();
        System.out.println("protocol = " + protocol);

        int port1 = url.getPort();
        System.out.println("port1 = " + port1);     // -1 -> 없기 때문

        int defaultPort = url.getDefaultPort();
        System.out.println("defaultPort = " + defaultPort);     // 443 -> 없어도 기본 포트 반환

        String file = url.getFile();
        System.out.println("file = " + file);       // path + query 반환




    }
}
