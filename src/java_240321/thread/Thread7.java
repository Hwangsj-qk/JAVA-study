package java_240321.thread;

import java.util.Scanner;

public class Thread7 {
    public static void main(String[] args) {
        // 스레드의 대기와 정지
        Thread tazanTread = new Thread(new TazangSong(10), "시끄러운 어린이");
        tazanTread.start();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.nextLine();

            if(input.equals("끝났니?")) {
                System.out.println("노래 끝났어?");
                if(tazanTread.isAlive()) {
                    // isAlive() : 스레드의 생사확인 여부를 살아있으면 true, 종료되면 false
                    System.out.println("아니, 계속할거야");
                } else {
                    System.out.println("끝났어. ");
                }
            }
            if(input.equals("듣자")) {
                System.out.println("일단 끝날때까지 듣자 ");
                try {
                    // 타잔 스레드의 작업이 종료될때까지 현재(메인) 스레드를 대기 시킴
                    // 스레드의 작업 순서를 조정할 수 있음
                    tazanTread.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            if(input.equals("그만해")) {
                System.out.println("이제 그만~");
                // stop : 해당 스레드(시끄러운 아이 스레드)를 강제 종료 -> 잘 사용하지 않음
                // 스레드가 강제종료 될 경우 데이터가 오염되거나 리소스가 샐 위험이 존재 -> deprecated
                // -> 자바 2버전부터 금지 (에러 발생)
//                tazanTread.stop();

                tazanTread.interrupt();
            }


            // "q" 입력시 종료 (시끄러운 아이 스레드의 경우, "그만해"를 통해 종료할 수 있음)
            if(input.equals("q")) break;

            // 입력한 내용을 메아리로 반복(현재 시끄러운 아이 스레드와 메인 스레드 두개가 실행되고 있음)
            System.out.println(Thread.currentThread().getName() + " : " +  input);
        }
    }
}
