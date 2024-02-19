package java_240219.Class0;

import java.util.Scanner;

public class Animal {
    String type;
    String name;
    int age;
    Scanner scanner = new Scanner(System.in);
    void animalType() {
        System.out.print("동물의 종류를 입력하세요: ");
        type = scanner.nextLine();

    }
    void animalName() {
        System.out.print("동물의 이름을 입력하세요: ");
        name = scanner.nextLine();

    }
    void animalAge() {
        System.out.print("동물의 나이를 입력하세요: ");
        age = scanner.nextInt();

    }
    void animalData() {
        System.out.println();
        System.out.println("동물 정보 ");
        System.out.println("=======================");
        System.out.println("동물 종류: " + type);
        System.out.println("동물 이름: " + name );
        System.out.println("동물의 나이: " + age);

    }

}
