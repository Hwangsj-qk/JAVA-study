package quiz_240229_2.quiz4;

public class Warrior implements Attackable {
String name;
    Warrior(String name){

    }

    @Override
    public void attack(Character character) {
        System.out.println("전사는 " + name + "을(를) 공겨합니다. 강한 공격!");
    }
}


