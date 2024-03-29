package quiz_240229_2.quiz4;

public class Healer implements Healable {
String name;
    Healer(String name) {

    }
    @Override
    public void heal(Character character) {
        System.out.println("힐러는 " + name + "을(를) 치유합니다. 치유의 빛!");

    }
}
