package java_240328.network.tcp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {
        String hostName = "localhost";
        int port = 12345;

        try(Socket socket = new Socket(hostName, port);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);

        ) {
            while (true) {
                // 서버로 부터 입력 받기
                String fromServer = in.readLine();
                if(fromServer == null) break;
                System.out.println(fromServer);         // 사용자에게 출력

                // 사용자로부터 입력받기
                String fromConsole = scanner.nextLine();
                if(fromConsole != null) {
                    System.out.println(fromConsole);
                    out.println(fromConsole);               // 서버로 출력(보내기)
                }
            }
        } catch (IOException e) {
            System.out.println("오류가 발생했니다: " + e.getMessage());
        }
    }

}
