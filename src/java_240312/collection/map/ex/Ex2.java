package java_240312.collection.map.ex;

import java_240222.inheritance.Parent;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class Ex2 {
    /*
        연습문제 2: 단어 빈도수 계산
    문제 설명
    한 문장 내에서 각 단어가 몇 번 나타나는지 계산하는 프로그램을 작성하세요.
     대소문자는 구분하지 않으며, 단어는 공백으로 구분된다고 가정합니다.
     결과는 단어를 키로 하고, 빈도수를 값으로 하는 HashMap에 저장해야 합니다.

    입력 예시
    ===
    String text = "나는 집에 간다. 나는 학교에 간다.";

    출력 예시
    ===
    단어 빈도수:
    간다: 2
    집에: 1
    나는: 2
    학교에: 1

    힌트 :
    문자열 메서드 사용
    한글이 아닌 정규식 "[^가-힣]"
     */
    public static void main(String[] args) {
        Map<String, Integer> wordMap = new HashMap<>();

        String text = "나는 집에 간다. 나는 학교에 간다.";

        // 대소문자 구분X
        String lowerCaseText = text.toLowerCase();

        // 공백을 기준으로 단어 나누기
        String[] textWords = lowerCaseText.split(" ");

        for (String textWord : textWords) {
            // 한글이 아닌 모든 요소 제거
            String replaced = textWord.replaceAll("[^가-힣]", "");
            // wordMap에 put (반복문을 돌면서 없으면 기본값 0, 있으면 +1)
            wordMap.put(textWord, wordMap.getOrDefault(textWord, 0) + 1);
        }

        // 출력을 위해 keySet 만들기
        Set<String> keySet = wordMap.keySet();

        for (String key : keySet) {
            System.out.println(key + " : " + wordMap.get(key));
        }

    }

}

