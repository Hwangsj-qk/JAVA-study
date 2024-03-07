package java_240305.library.lang;

import JAVA_240215.method.Char;

public class Wrapper {
    // 래퍼 클래스 = 자바의 기본 타입 값을 갖는 객체를 생성(포장)하는 클래스
    // 기본타입 : 메모리 주소에 값이 대입되고 성능이 좋다.
    // 기본 타입의 값은 외부에서 변경 불가, 메서드를 사용할 수 없다.

    public static void main(String[] args) {
        // 기본 타입
        byte b =1;
        short s = 2;
        int i = 4;
        long l = 8;
        float f = 4.0f;
        double d = 8.0;
        boolean bool = false;
        char c = 'A';

//        int i2 = null     기본 데이터 타입은 null 값을 가질 수 없다.
        // 컬렉션 프레임워크에 기본 데이터 값을 저장할 수 없다.

        // 포장 타입 (Wrapper type)
        Byte aByte = 1;
        Short aShort = 2;
        Integer integer = 4;
        Long aLong = 8L;
        Float aFloat = 4.0f;
        Double aDouble = 8.0;
        Boolean aBoolean = true;
        Character character = 'B';
        Integer integerNull = null;     // null 값을 가질 수 있다.

        // integer. <= .으로 다양한 메서드에 접근 가능
        // 컬렉션 프레임 워크에 저장할 수 있다.
        // 데이터를 저장하는 자료 구조와 데이터를 처리하는 알고리즘을 구조화하여 클래스로 구현해 놓은 것

        // 기본 타입과 포장 타입을 변환하는 과정: Boxing, UnBoxing

        // Boxing : 기본 타입 => 포장 타입
        int intPrimitive = 10;
        Integer intWrap = Integer.valueOf(intPrimitive);

        // UnBoxing : 포장 타입 => 기본 타입
        int unboxedInt = intWrap.intValue();

        // 자동 Boxing : 명시적으로 선언하지 않아도 자동으로 포장
        // 컴파일러에서 자동으로 처리
        Integer autoWrap = intPrimitive;
        // autoWrap 은 포장 타입이지만 intPrimitive 는 기본 타입 -> 자동 Boxing

        // 자동 UnBoxing
        int autoUnboxedInt = autoWrap;
        // autoWrap 은 포장 타입이지만 autoUnboxedInt 는 기본타입 -> 자동 Unboxing

        // 자동 Boxing 과 자동 UnBoxing 은 성능상으로 떨어질 수 있으니 반복문 등에서는 자제
        // 혼합하여 연산 가능
        int calculatedInt = intPrimitive + intWrap;

        // 유용한 메서드

        // 문자열로부터 래퍼 객체 반환
        Integer intValue = Integer.valueOf("1004");

        // 정수 자료형들에 존재하는 기본 타입 파싱 메서드
        Integer.parseInt("100");
        Long parsedLong = Long.parseLong("1000000000");
        Double parsedDouble = Double.parseDouble("1000.1212");

        // 문자 자료형 메서드
        String str = "문자열 Ab1 . ";
        for (int j = 0; j < str.length(); j++) {
            Character ch = str.charAt(i);
            boolean letter = Character.isLetter(ch);
            boolean digit = Character.isDigit(ch);
            boolean spaceChar = Character.isSpaceChar(ch);
            boolean lowerCase = Character.isLowerCase(ch);
        }



    }
}
