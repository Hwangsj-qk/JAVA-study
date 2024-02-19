package JAVA_240214.reference;

public class Ref4 {
    public static void main(String[] args) {
        // 기본타입
        int a = 10;
        int b = a;  // 값(10)이 복사되어 대입

        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 10

        a =20;  // a값을 변경
        System.out.println("======");
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 10

        b = 100;
        System.out.println("======");
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 100

        System.out.println("==============");

        // 참조타입
        Data dataA = new Data();
        dataA.value1 = 100;
        Data dataB = dataA; //값(=data.value1 -> 참조값)이 복사되어 대입 : 얕은 복사 (객체가 복사된 것이x, 주소가 복사된 것)

        System.out.println("DataA = " + dataA); // 참조값 0x10
        System.out.println("DataB = " + dataB); // 참조값 0x10

        //A의 값이 변경
        dataA.value1 = 200;
        System.out.println("dataA.value1 = " + dataA.value1); //200
        System.out.println("dataB.value1 = " + dataB.value1); // 200

        // B의 값이 변경
        dataB.value1 = 300;
        System.out.println("dataA.value1 = " + dataA.value1); // 300
        System.out.println("dataB.value1 = " + dataB.value1); // 300
        // 두 개 중 하나만 변경되어도 둘 다 변경

    }
}
