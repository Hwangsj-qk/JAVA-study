package java_240305.library.util.ex;

import java_240220.access_modifier.first.B;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {
    /*
    연습 문제 2: 랜덤 비밀번호 생성기
요구사항: 사용자로부터 비밀번호의 길이를 입력받아,
해당 길이를 가진 랜덤 비밀번호를 생성하는 프로그램을 작성하세요.
비밀번호는 대문자, 소문자, 숫자를 포함해야 합니다.

입력 예시:
8

출력 예시:
생성된 비밀번호: X7gA2fHq

힌트:
// 비밀번호에 사용될 문자 세트
String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("비밀번호의 길이를 입력하세요: ");
        int passwordLong = scanner.nextInt();
        System.out.println(getRandomPassword(passwordLong));
    }


        static String getRandomPassword(int passwordLong) {
            SecureRandom random = new SecureRandom();
            StringBuilder sb = new StringBuilder();

            String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

            for (int i = 0; i < passwordLong; i++) {
                int randomChar = random.nextInt(charSet.length());
                sb.append(charSet.charAt(randomChar));
            }

            String randomPassword = sb.toString();
            String pattorn = ".*[0-9].*" + ".*[A-Z].*" + ".*[a-z].*";

            if(!pattorn.matches(pattorn)) {
                return getRandomPassword(passwordLong);

            }
            return randomPassword;

        }






}
