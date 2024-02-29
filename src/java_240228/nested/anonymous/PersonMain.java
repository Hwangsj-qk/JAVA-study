package java_240228.nested.anonymous;

public class PersonMain {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();

        // 익명 객체의 필드에 접근하여 사용 (work, play는 사용할 수 없음)
        anonymous.person.wake();

        // 익명 객체 로컬 변수로 사용하기
        anonymous.method();

        // 익명 객체를 매개변수로 사용하기
        anonymous.methodParam(new Person(){
            @Override
            void wake() {
                System.out.println("아침 5시에 일어납니다.");
                study();
            }
            void study() {
                System.out.println("공부합니다. ");
            }

        });
    }
}
