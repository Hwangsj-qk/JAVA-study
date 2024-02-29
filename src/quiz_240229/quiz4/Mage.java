package quiz_240229.quiz4;

public class Mage implements Attackable{

    String name;
    Mage(String name) {

    }


    @Override
    public void attack(Character character) {
        System.out.println("이(가)" + name + "에게 마법 공격을 합니다. 불의 화살!");
    }
}
