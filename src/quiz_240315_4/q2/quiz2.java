package quiz_240315_4.q2;

import java.util.Arrays;

public class quiz2 {
    public static void main(String[] args) {
        String sentence = "김철수,30,kimcs@gmail.com;이영희,25,younghee@naver.com;박보검,22,bogum@daum.net;김민아,35,mina@gmail.com";

        String[] splitSentence = sentence.split(";");
        System.out.println("전체 사용자수: " + splitSentence.length);

        System.out.println("사용자 정보: ");

        for (String string : splitSentence) {
            String[] split = string.split(",");
//            System.out.println(Arrays.toString(split));
            System.out.println("이름: " + split[0] + ", 나이: " + split[1]+ ", 이메일: " + split[2]);
        }
        System.out.println();
        System.out.println("gmail.com' 도메인 사용자: ");

        for (int i = 0; i < splitSentence.length; i++) {
            String[] split = splitSentence[i].split(",");
            if (split[2].contains("gmail.com")) {
                System.out.println(split[0]);
            }
        }


    }
}
