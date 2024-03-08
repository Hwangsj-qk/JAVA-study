package java_240305.library.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.SQLOutput;

public class BigNumber {
    public static void main(String[] args) {
        // Long의 최대값 최소값 범위
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        // 범위를 넘어가는 매우 큰 수를 다루기 위한 클래스
        // BigInteger
//        Long longNumber = 9223372036854775808L;       // 넘을 수 없음
        BigInteger bigInt1 = new BigInteger("922337203685477580734");
        BigInteger bigInt2 = new BigInteger("922337203685477580738");

        // 덧셈
        BigInteger sum = bigInt1.add(bigInt2);
        System.out.println("큰 수 덧셈: " + sum);

        // 뻴셈
        BigInteger sub = bigInt1.subtract(bigInt2);
        System.out.println("큰 수 뺄셈: " + sub);

        // 곱셈
        BigInteger mul = bigInt1.multiply(bigInt2);
        System.out.println("큰 수 곱셈: " + mul);

        // 나눗셈
        BigInteger div = bigInt1.divide(bigInt2);
        System.out.println("큰 수 나눗셈: " + div);
        // '정수'이므로 소수점은 모두 버림

        // 거듭제곱
        BigInteger pow = BigInteger.valueOf(2).pow(64);
        System.out.println("2 ^ 64: " + pow);

        // 최대 공약수
        BigInteger gcd = bigInt1.gcd(bigInt2);
        System.out.println("최대공약수: " + gcd);

        System.out.println("==================");

        // 부동 소수점 정밀도 오류
        System.out.println("0.1 + 0.2 = " + (0.1 + 0.2));
        // 제대로 계산 못함(컴퓨터한테는 소수가 어려움)

        BigDecimal bigDecimal1 = new BigDecimal("1.0");
        BigDecimal bigDecimal2 = new BigDecimal("0.2");

        System.out.println("===== BigDecimal 사용 =====");

        System.out.println("0.1 + 0.2 = " + bigDecimal1.add(bigDecimal2));
        System.out.println("0.1 - 0.2 = " + bigDecimal1.subtract(bigDecimal2));

        BigDecimal b1 = new BigDecimal("0.2");
        BigDecimal b2 = new BigDecimal("0.4");
        System.out.println("0.2 * 0.4 = " + b1.multiply(b2));








    }
}
