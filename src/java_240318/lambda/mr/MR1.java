package java_240318.lambda.mr;

public class MR1 {
    public static void main(String[] args) {
        Person person = new Person();

        // 정적 메서드를 사용하는 경우
//        person.action((x,y) -> Computer.staticeMethod(x, y));
        person.action(Computer::staticMethod);

        // 인스턴스 메서드를 사용하는 경우
        Computer computer = new Computer();
        person.action(computer:: instanceMultiMethod);
    }

}
