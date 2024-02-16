package JAVA_240207.variable;

import java.io.IOException;
import java.util.Scanner;

public class Read1 {
    public static void main(String[] args) throws IOException {
        int read = System.in.read();    // 시스템 입력장치에서 키를 읽어라(로컬창에 내가 입력한 값을 읽어오는 것)
        //dlfrdms rufrhksms keyCode(아스키코드)로 저장됨 -> 암호화 -> 인코딩
        System.out.println(read);
        // 아스키 코드나 유니코드의 암호 넘버를 읽어 옴.
        // read는 "제일 앞 한글자만" 아스키 코드 혹은 유니코드로 읽어옴

        // 키보드에 입력된 내용을 문자열로 얻기
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        // String(문자열)로 입력받고 싶으면 next()나 nextLine()를 사용하고,
        // int(정수)를 입력받고 싶으면 nextInt()를 사용
        System.out.println(s);
        // 만약 문자열이 하나 이상일 경우 제일 첫번재 글자만 read를 통해 아스키 or 유니코드로 암호화되고
        // 나머지 글자는 scanner를 통해 문자열로 받아들여짐.


    }
}