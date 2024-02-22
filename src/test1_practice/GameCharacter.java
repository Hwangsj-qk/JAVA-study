package test1_practice;

public class GameCharacter {
    // 필드
    String name;
    int level = 1;
    int health;

    GameCharacter(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

    public void attack() {
        System.out.println(name + " 의 공격!");
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(name + "이 공격을 받았습니다." + damage + "를 입었습니다. 체력이 " +
                health + " 남았습니다. ");
    }
}