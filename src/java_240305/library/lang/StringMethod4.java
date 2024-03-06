package java_240305.library.lang;

public class StringMethod4 {
    public static void main(String[] args) {
        String hello = "Hello, Java!";

        // 대소문자 변환
        System.out.println(hello.toUpperCase());     // 모두 대문자로 변환
        System.out.println(hello.toLowerCase());     // 모두 소문자로 변환

        String sentence = "Hello, How are you?";

        // 대소문자를 엄격하게 구분하기 때문에 포함여부를 일반적인 확인이 어렵다.
        boolean res1 = sentence.contains("how");    // false
        System.out.println("res1 = " + res1);

        // 영문 텍스트 검색에서 대소문자 입력 무관하게 포함 여부 확인 시 활용
        if(sentence.toLowerCase().contains("how")) {    // true
//            sentence.toUpperCase().contains("How".toUpperCase()); 사용 가능
//            sentence.toLowerCase().contains("How".toLowerCase()); 사용 가능
            System.out.println("how 단어를 포함합니다.");
        } else {
            System.out.println("how 단어를 포함하지 않습니다.");
        }
        // ※ 문자열은 모두 문자열 인스턴스여서 바로 .을 찍고 사용 가능

    }
}
