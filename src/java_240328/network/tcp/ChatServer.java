package java_240328.network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
    private static final int PORT = 12345;

    // 채팅에 접속한 클라이언트 리스트
    private static List<ClientHandler> clients = new ArrayList<>();

    public static void main(String[] args) {
        // 특정 포트에서 클라이언트 연결을 기다린다.
        try (ServerSocket serverSocket = new ServerSocket(PORT)){
            System.out.printf("채팅 서버가 %s 포트에서 실행 중입니다 \n" ,PORT);

            // 무한 루프로 대기하면서 클라이언트가 접속할 때마다
            // 클라이언트 소켓을 생성하고 스레드 시작하고 대기
            while (true) {
                Socket clientSocket = serverSocket.accept();

                // 클라이언트 별로 스레드를 시작
                // 핸들러 생성, 리스트에 추가, 스레드 시작
                ClientHandler clientHandler = new ClientHandler(clientSocket);
                clients.add(clientHandler);     // 채팅에 여러 명이 들어갈 수 있도록 리스트 생성 후 입력
                clientHandler.start();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 클라이언트의 접속에 관련된 것을 다루는 내부 클래스
    static  class ClientHandler extends Thread{
        // 필드
        private Socket socket;      // 클라이언트 연결 소켓
        private PrintWriter out;    // 출력 스트림
        private BufferedReader in;  // 입력 스트림
        private String name;        // 클라이언트 대화명

        // 생성 시, 서버 소켓으로부터 소켓 정보를 받는다.
        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            // 스레드가 시작되면 입출력 스트림 할당
            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);

                // 대화명 입력
                out. println("대화명을 입력해주세요: ");    // 클라이언트에게 출력
                name = in.readLine();       // 클라이언트에게 대화명 입력 받음
                String hostAddress = socket.getInetAddress().getHostAddress();
                System.out.println(name + ":" + hostAddress + "님이 입장하셨습니다. ");  // 서버에 출력
                out.println(name + ":" + hostAddress + "님이 입장하셨습니다. ");     // 클라이언트에 출력

                // 클라이언트로부터 메시지를 받아서 출력
                while (true) {
                    String fromUser = in.readLine();
                    String charMsg = String.format("[%s:%s] : %s", name,
                            socket.getInetAddress().getHostAddress(), fromUser);
                    System.out.println(charMsg);

                    // 접속한 모두에게 메시지를 저송
                    for (ClientHandler client : clients) {
                        client.out.println(charMsg);
                    }

                }
            } catch (IOException e) {
                System.out.println("예외가 발생했습니다. " + e.getMessage());
            } finally {
                // 채팅을 종료한 클라이언트는 리스트에서 제거하기
                clients.remove(this);
                // 모두 에게 알리기 (서버, 채팅에 참여한 클라이언트)
                String exitMsg = String.format("%s님이 나가셨습니다.", name);
                System.out.println(exitMsg);
                for (ClientHandler client : clients) {
                    client.out.println(exitMsg);
                }
            }
        }
    }
}
