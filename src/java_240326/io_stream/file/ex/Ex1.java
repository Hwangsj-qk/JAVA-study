package java_240326.io_stream.file.ex;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ex1 {
    /*
    연습문제 1: 사용자 정보 저장 및 조회 시스템
    사용자로부터 이름, 이메일, 나이를 입력받아,
    각 사용자마다 개별 파일로 저장하는 프로그램을 작성하세요.
    그리고 저장된 사용자 정보 파일 목록을 조회할 수 있는 기능도 구현하세요.

    요구사항:

    - 사용자 정보는 "사용자이름.user" 형식의 파일에 저장합니다.
    - 파일에는 이름, 이메일, 나이가 각 줄에 저장되어야 합니다.
    - 프로그램 실행 시 사용자에게 "정보 저장"과 "정보 조회" 중 선택할 수 있게 합니다.
    - "정보 조회" 선택 시 저장된 모든 사용자 정보 파일 목록을 출력합니다.

    실행예시
    ===
    1: 정보 저장, 2: 정보 조회
    1
    이름: 홍길동
    이메일: abc@def.com
    나이: 30
    정보 저장 완료.


    1: 정보 저장, 2: 정보 조회
    2
    홍길동.user
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: 정보저장, 2: 정보 조회");
        int choose = scanner.nextInt();

        Path currentPath = Paths.get(
                "src", "java_240326", "io_stream", "file", "ex");

        if(choose == 1) {
            System.out.println("이름을 입력하세요: ");
            String name = scanner.next();
            System.out.println("이메일을 입력하세요: ");
            String email = scanner.next();
            System.out.println("나이를 입력하세요: ");
            int age = scanner.nextInt();

            Path targetPath = currentPath.resolve(name + ".user");

            try {
                OutputStream os = new FileOutputStream(new File(String.valueOf(targetPath)));
                os.write(("이름: " + name + "\n").getBytes());
                os.write(("이메일: " + email +"\n").getBytes());
                os.write(("나이: " + age + "\n").getBytes());

                System.out.println("정보 저장 완료");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (choose == 2) {
            File tempDir = new File(currentPath.toString());
            File[] files = tempDir.listFiles();

            for (File file : files) {
                if (file.getName().contains(".user")) {
                    System.out.println(file.getName());
                }
            }

        } else {
            System.out.println("잘못된 입력입니다.");
    }
    }
}
