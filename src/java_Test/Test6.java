package java_Test;

public class Test6 {
    public static void main(String[] args) {
        GameCharacter 마법사 = new GameCharacter("마법사", 20, 200);
        GameCharacter 전사 = new GameCharacter("전사", 10, 100);

        전사.attack();
        마법사.takeDamage(10);

        마법사.attack();
        전사.takeDamage(20);
    }
}
