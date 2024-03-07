package java_240305.library.lang.ex;

import test1_practice.Array;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex10 {
    /*

요구사항:
사용자 정보가 담긴 문자열 데이터가 있습니다.
각 사용자 정보는 세미콜론(;)으로 구분되어 있으며,
각 사용자의 정보 내에서는 이름, 나이, 이메일이 콤마(,)로 구분되어 있습니다.
이 데이터를 파싱(쪼개서 분석)하여 다음 정보를 출력하는 프로그램을 작성하세요.

- 전체 사용자 수.
- 각 사용자의 이름, 나이, 이메일 정보 출력.
- 입력된 사용자 중 이메일 도메인이 "gmail.com"인 사용자의 이름을 출력.
- 가장 나이가 많은 사용자의 이름과 나이 출력.
- 이름에 "김"이 포함된 사용자 수.

입력 예시 문자열
===
김철수,30,kimcs@gmail.com;이영희,25,younghee@naver.com;박보검,22,bogum@daum.net;김민아,35,mina@gmail.com

출력 예시
===
전체 사용자 수: 4
사용자 정보:
- 이름: 김철수, 나이: 30, 이메일: kimcs@gmail.com
- 이름: 이영희, 나이: 25, 이메일: younghee@naver.com
- 이름: 박보검, 나이: 22, 이메일: bogum@daum.net
- 이름: 김민아, 나이: 35, 이메일: mina@gmail.com
"gmail.com" 도메인 사용자:
- 김철수
- 김민아
가장 나이가 많은 사용자:
- 이름: 김민아, 나이: 35
이름에 "김"이 포함된 사용자 수: 2
     */
    public static void main(String[] args) {
        String sentence = "김철수,30,kimcs@gmail.com;" +
                "이영희,25,younghee@naver.com;" +
                "박보검,22,bogum@daum.net;" +
                "김민아,35,mina@gmail.com";

        String [] memberInfo = sentence.split("[;]");
        System.out.println(Arrays.toString(memberInfo));

        System.out.println("전체 사용자 수: " + memberInfo.length);
        System.out.println();

        List<String> name = new ArrayList<>();      // 내부적으로 배열의 형태를 가지고 있는 리스트를 만듦
        List<Integer> age = new ArrayList<>();
        int max = 0;
        String elder = null;
        int firstName =0;


        for (String s : memberInfo) {
            String [] member = s.split(",");
//            System.out.println(Arrays.toString(member));

            // 사용자 정부 출력
            System.out.println("이름: " + member[0] + ", 나이: " + member[1] + ", 이메일: " + member[2]);

            if (member[2].contains("gmail.com")) {      // endWith()도 활용할 수 있음
                name.add(member[0]);        // StringBuilder 사용 후 append 사용 가능
            }
            age.add(Integer.parseInt(member[1]));
            max = age.get(0);
            elder = member[0];

            for (Integer num : age) {
                if(num > max){
                    max = num;
                }
            }
            for (String elderMember : member) {
                if(Integer.parseInt(member[1]) > max) {
                    elderMember = elder;
                }
            }
            if (member[0].contains("김")) {
                firstName++;
            }
        }

        System.out.println();

        // "gmail.com" 도메인 사용자 출력
        System.out.println("\"gmail.com\" 도메인 사용자: ");
        for (String s : name) {
            System.out.println(s);
        }

        System.out.println();

        // 가장 나이가 많은 사용자 출력
        System.out.println("가장 나이가 많은 사용자: ");
        System.out.println("이름: " + elder + ", 나이: " + max);

        System.out.println();

        // "김"이 포함된 사용자수 출력
        System.out.println("\"김\"이 포함된 사용자수: ");
        System.out.println(firstName);











    }
}
