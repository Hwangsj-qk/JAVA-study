package java_240226.polymorphism.interface0.ex.ex3;

public class Warrior extends Character implements Attackable{
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attack(Character character) {
        System.out.println(name + "이(가) " + character.name + "를(을) 공격합니다. 강한 공격!");
    }
}
