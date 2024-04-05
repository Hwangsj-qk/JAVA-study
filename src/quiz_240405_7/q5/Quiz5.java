package quiz_240405_7.q5;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Quiz5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("경로를 입력하세요: ");
        String path = scanner.nextLine();

        File file = new File(path);

            long length = file.length();

        System.out.println("파일 크기: " + length + " byte 입니다.");

    }
}
