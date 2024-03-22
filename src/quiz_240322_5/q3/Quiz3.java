package quiz_240322_5.q3;

import java.util.HashMap;
import java.util.Map;

public class Quiz3 {
    public static void main(String[] args) {
        String text = "나는 집에 간다. 나는 학교에 간다.";

        String textLowerCase = text.toLowerCase();
        String str = textLowerCase.replaceAll("[^가-힣]", " ");
        String[] wordSplit = str.split(" ");


        Map<String, Integer> words = new HashMap<>();

        for (int i = 0; i < wordSplit.length; i++) {
            if(words.containsKey(wordSplit[i])) {
                words.put(wordSplit[i],words.get(wordSplit[i]) + 1);
            } else {
                words.put(wordSplit[i],1);
            }
        }



        for (String string : words.keySet()) {
            System.out.println(string + " : " + words.get(string));
        }







    }
}
