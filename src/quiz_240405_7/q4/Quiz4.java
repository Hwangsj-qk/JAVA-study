package quiz_240405_7.q4;

import java.io.*;
import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/quiz_240405_7/q4/output.txt"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("텍스트를 입력하세요(\"종료\" 입력시 프로그램 종료)");
            String text = scanner.nextLine();
            if (text.equals("종료")) break;
            bw.write(text);
            bw.newLine();
        }
        bw.flush();
        bw.close();




    }
}
