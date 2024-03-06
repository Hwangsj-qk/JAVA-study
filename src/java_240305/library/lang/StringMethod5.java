package java_240305.library.lang;

public class StringMethod5 {
    public static void main(String[] args) {
        // 문자열 연결하기
        String la1 = "라랄 -";
        String la2 = "랄라";
        String la3 = "라랄라";

        String lalala1 = la1 + la2 + la3;
        System.out.println(lalala1);

        String lala1 = la1.concat(la2);
        System.out.println(lala1);

        // 메서드 체인 활용하기
        // concat() : 문자열 연결하기
        String lalalala = la1.concat(la2).concat(la3).concat(lalala1);
        System.out.println(lalalala);

        // concat 메서드가 사용될때마다 문자열이 새로 생성된다. (메모리 공간을 많이 차지하게 됨) (문자열 = 불변객체)
        // 내부적으로 더 효율적인 방법 => stringBuffer, StringBuilder
        
        // 변경이 가능한 문자열을 활용할 수 있음. 
        StringBuffer stringBuffer;      // 다중 스레드 환경일 때 사용
        StringBuilder stringBuilder;    // 단일 스레드 환경일 때 => 성능이 더 좋음 

        StringBuilder sb = new StringBuilder();

        // 메서드 체이닝 기법, append() 메서드는 문자열 뒤에 내용을 추가하고
        // StringBuilder 타입을 return 함. 최종 문자열을 반환하고 싶을 대는 toString()
        String result = sb.append(la1)
                .append(la2)
                .append(" ")
                .append(la3)
                .toString();
        System.out.println("result = " + result);

        // concat 과 StringBuilder 의 차이점
//       "가".concat("나").concat("다").concat("라").concat(1).concat(10.0);
        // 오류 concat 은 문자열만 가능. (int, double 은 불가능)

        // "가", "나", "다", "라", "가나", "가나다" , "가나다라"
        // 메모리 상 총 7개의 문자열이 생성되어 공간을 차지

        String builder = new StringBuilder("가")
                .append("나")
                .append("다")
                .append("라").toString();
//                .append(1)      //문자열 이외 다른 타입 가능
//                .append(10.0);
        // "가", "나", "다", "라", "가나다라"
        // 메모리상 총 5개의 문자열이 생성되어 공간을 차지

        StringBuilder sb2 = new StringBuilder("hello");

        // append: 문자열 끝에 다양한 타입 추가
        sb2.append(" java");
        System.out.println(sb2.toString());     // hello java
        // println 안에서는 toString()을 사용하지 않아도 되지만, 그 이외에는 모두 사용 해야함.

        // insert : 특정 위치 문자열 삽입
        sb2.insert(6, "World ");
        System.out.println(sb2.toString());     // hello World java

        // delete : 특정 위치에 문자열 삭제
        sb2.delete(5, 11);
        System.out.println(sb2.toString());     // hello java

        // reverse : 문자열 뒤집기
        sb2.reverse();
        System.out.println(sb2.toString());     // avaj olleh

        // 생성 후에도 문자열 변경 가능하며, 새로운 객체가 생성되지 않는다. (문자열의 불변성)


    }
}
