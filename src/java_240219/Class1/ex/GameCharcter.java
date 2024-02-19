package java_240219.Class1.ex;

import java.util.Scanner;

public class GameCharcter {
    String name;
    int level;
    int health;

    GameCharcter (String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }
void attack() {
    Scanner scanner = new Scanner(System.in);
    String attac = scanner.nextLine();
        this.name = name;

        if (attac == "p") {
            System.out.println(name + " attack!");
        }

    System.out.println(name + " attack!");
}

void takeDamage(int damage) {


}


}
