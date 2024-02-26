package java_240226.polymorphism.abstaraction;

public class Chicken extends Animal{
    @Override
    public void sound() {       // 메서드 이름이 상속받은 클래스의 메서드 이름과 다르면 컴파일 에러
        System.out.println("꼭끼오");
    }
    // cock이라는 메서드를 만들고 싶으면 sound 메서드를 무조건 하나 만들고 나서 다른 메서드 하나 더 생성은 가능
}
