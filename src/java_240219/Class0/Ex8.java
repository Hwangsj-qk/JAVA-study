package java_240219.Class0;

import java.util.Scanner;

public class Ex8 {
    // 1. 동물(Animal) 클래스 정의
    // 동물(Animal) 클래스를 정의하고, 동물의 종류, 이름, 나이를 데이터로 가지고 동물의 정보를 출력하는 메서들ㄹ 가짐
    // 2. 해당 클래스를 메인 메소드에 생성하고 사용해보세요.

    public static void main(String[] args) {
        Animal animal = new Animal();

        Scanner scanner = new Scanner(System.in);

        animal.animalType();
        animal.animalName();
        animal.animalAge();
        animal.animalData();
    }
}
