package java_240220.access_modifier.first;

public class A {
    // 내부에서 접근
    A publicA = new A(100);     // public 내부접근 가능
    A defaultA = new A();           // public 내부접근 가능
    A privateA = new A("100");   // public 내부접근 가능

    // 생성자가 접근제한자에 따라 3가지 정의
    // public
    public A(int a) {
        System.out.println("public A 생성자");
    }

    A() {
        System.out.println("defult(접근 제한자) 클래스 A 생성자");
    }

    private A(String a) {
        System.out.println("private A 생성자");
    }
}

