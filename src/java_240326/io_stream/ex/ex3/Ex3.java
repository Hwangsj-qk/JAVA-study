package java_240326.io_stream.ex.ex3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ex3 {
        /*
    연습문제: 텍스트 기반 채팅 로그 분석기

    문제 설명
    채팅 애플리케이션의 로그 파일을 분석하는 프로그램을 작성해야 합니다.
    이 프로그램은 주어진 텍스트 파일 형식의 채팅 로그에서
    각 사용자별로 메시지를 얼마나 보냈는지 분석하여
    결과를 "chatSummary.txt" 파일에 저장해야 합니다.

    요구 사항
    - 로그 파일 형식: "chat.log" 로그 파일은 각 줄마다 하나의 메시지를 기록하며,
    각 메시지는 다음 형식을 따릅니다: [시간] 사용자명: 메시지
    - 결과 파일: "chatSummary.txt" 파일에는 각 사용자별로 보낸 메시지의 총 개수를
    기록합니다. 사용자별로 한 줄에 기록하며, 형식은 다음과 같습니다: 사용자명: 메시지 개수

    chat.log
    ===
    [08:45] 길동씨: 좋은 아침이에요!
    [08:47] 무대리: 모두 좋은 아침입니다.
    [08:49] 박진수: 오늘 회의 시간에 늦지 않게 출발해야겠어요.
    [08:50] 길동씨: 네, 안전하게 오세요.
    [09:00] 박진수: 저도 도착했습니다. 회의실 어디에요?
    [09:01] 강감찬: 2층 회의실 3번입니다.
    [09:03] 길동씨: 아, 커피 한잔 마시고 올라갈게요. 누구 커피 드릴까요?
    [09:04] 무대리: 저는 아메리카노 부탁드립니다.
    [09:05] 박진수: 저는 라떼로 부탁드려요. 감사합니다!
    [09:07] 강감찬: 저도 아메리카노로 해주세요.
    [09:10] 길동씨: 알겠습니다. 잠시 후에 회의실에서 뵐게요.
    [09:15] 무대리: 모두 회의 준비는 잘 되어가나요?
    [09:17] 박진수: 네, 거의 다 준비된 것 같아요.
    [09:20] 길동씨: 커피 다 준비했습니다. 회의 시작해요!

    chatSummary.txt
    ===
    박진수: 4
    길동씨: 5
    무대리: 3
    강감찬: 2
     */
        public static <Set> void main(String[] args) throws IOException {
            // 전체 문자 메시지를 담을 파일 생성
            BufferedWriter chatlogs = new BufferedWriter(
                    new FileWriter("src/java_240326/io_stream/ex/ex3/chat.log.txt"));

            String [] messages = {"[08:45] 길동씨: 좋은 아침이에요!",
    "[08:47] 무대리: 모두 좋은 아침입니다.",
    "[08:49] 박진수: 오늘 회의 시간에 늦지 않게 출발해야겠어요.",
    "[08:50] 길동씨: 네, 안전하게 오세요.",
    "[09:00] 박진수: 저도 도착했습니다. 회의실 어디에요?",
    "[09:01] 강감찬: 2층 회의실 3번입니다.",
    "[09:03] 길동씨: 아, 커피 한잔 마시고 올라갈게요. 누구 커피 드릴까요?",
    "[09:04] 무대리: 저는 아메리카노 부탁드립니다.",
    "[09:05] 박진수: 저는 라떼로 부탁드려요. 감사합니다!",
    "[09:07] 강감찬: 저도 아메리카노로 해주세요.",
    "[09:10] 길동씨: 알겠습니다. 잠시 후에 회의실에서 뵐게요.",
    "[09:15] 무대리: 모두 회의 준비는 잘 되어가나요?",
    "[09:17] 박진수: 네, 거의 다 준비된 것 같아요.",
    "[09:20] 길동씨: 커피 다 준비했습니다. 회의 시작해요!"};

            // 지정된 파일에 줄 넘기면서 입력
            for (String message : messages) {
                chatlogs.write(message);
                chatlogs.newLine();
            }

            chatlogs.close();

            // 결과 파일을 생성
            BufferedWriter summarylogs = new BufferedWriter(
                    new FileWriter("src/java_240326/io_stream/ex/ex3/chatSummary.txt"));


            // 사용자당 메시지 개수를 담을 Map 생성 및 사용자당 메시지 개수 출력
            Map<String, Integer> summary = new HashMap<>();
            for (String message : messages) {
                String name = message.substring(8, 11);

                int frequency = summary.getOrDefault(name,0) + 1;
                summary.put(name,frequency);

            }

            // Map에서 key(사용자)당 값(메시지 개수) 로 출력하여 지정 파일에 담기
            for (String s : summary.keySet()) {
                summarylogs.write(s + " : " + summary.get(s));
                summarylogs.newLine();
            }

            summarylogs.close();




            




        }
}
