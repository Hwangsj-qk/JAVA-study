package java_240228.nested.ref;

import com.sun.security.jgss.GSSUtil;

public class OuterClass {
    // 바깥족 필드
    String OuterField = "바깥쪽 필드";
    String field = "바깥쪽 필드";

    //바깥족 메서드
    void OuterMethod(){
        System.out.println("바깥쪽 메서드");
    }
    void Method(){
        System.out.println("바깥쪽 메서드");
    }

    // 안쪽 중첩 클래스
    class InnerClass{
        String InnerField = "안쪽 필드";
        String field = "안쪽 필드";

        // 안쪽 메서드
        void innerMethod(){
            System.out.println("안쪽 메서드");
        }
        void Method() {
            System.out.println("안쪽 메서드");
        }
        void call() {
            // 1. 안쪽에서 안쪽(중첩객체 참조)
            System.out.println(field);     // 이름이 같을 때 => Scope이 가까운 족을 호출한다.
            System.out.println(this.field); // 필드의 이름이 겹칠 때 this 키워드로 명시적으로 가리킨다.
            System.out.println(InnerField); // 이름이 다를 때는 this 키워드 없이 호출 가능

            Method();
            this.Method();
            innerMethod();
            // 메서드도 필드와 동일한 원리

            // 안족에서 바깥쪽을 참조
            System.out.println(OuterClass.this.OuterField);
            System.out.println(OuterField);     // 이름이 다를 때는 바로 호출 가능
            OuterClass.this.Method();           // 이름이 같을 때는 바깥 클래스에서 this 키워드로 접근하여 호출
            OuterMethod();
            // 이름을 다르게 짓는 것이 가장 편리하긴 함.


    }

    }


}
