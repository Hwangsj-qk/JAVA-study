package java_240328.network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Network1 {
    public static void main(String[] args) {
        // IP 주소 관련 클래스 InetAddress
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("내 컴퓨터의 IP 주소: " + localHost);

            // IP 주소의 정보를 바이트 배열, 또는 문자열로 반환
            byte[] address = localHost.getAddress();        // 내 컴퓨터 이름
            String hostName = localHost.getHostName();      // 내 컴퓨터 IP
            String hostAddress = localHost.getHostAddress();

            System.out.println("address = " + Arrays.toString(address));
            System.out.println("hostName = " + hostName);
            System.out.println("hostAddress = " + hostAddress);

            // 도메인 주소로 IP주소 "객체" 반환
            InetAddress daumIp = InetAddress.getByName("www.daum.net");
            System.out.println("다음 호스트이름: " + daumIp.getHostAddress());
            System.out.println("다음 IP: " + daumIp.getHostName());

            // InetAddress의 배열 반환 - 호스트 이름에 대한 여러 IP주소를 배열로 반환
            InetAddress[] naverIPs = InetAddress.getAllByName("www.naver.com");
            for (InetAddress naverIP : naverIPs) {
                System.out.println(naverIP.getHostName() + ": " + naverIP.getHostAddress());
            }

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }

        // IP 주소가 할당된 호스트 정보 조회
        String example = "www.examplelalal.com";
        String naver = "www.naver.com";

        printAllIP(naver);
        // 존재함.

        printAllIP(example);
        // www.examplelalal.com에 할당된 IP주소를 찾지 못했습니다.

    }

    // 해당하는 IP 주소를 모두 출력하는 메서드
    static void printAllIP(String hostName) {
        try {
            InetAddress[] allByName = InetAddress.getAllByName(hostName);
            System.out.println(hostName + "에 할당된 IP 주소들입니다. ");
            for (InetAddress inetAddress : allByName) {
                System.out.println(inetAddress.getHostAddress());
            }
        } catch (UnknownHostException e) {
            System.out.println(hostName + "에 할당된 IP주소를 찾지 못했습니다. ");
        }
    }
}
