package java_240312.collection.set.ex;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Ex5 {
    /*
        연습문제: 고유 캐릭터 목록 관리 시스템
    목적
    온라인 게임에서 플레이어가 생성할 수 있는 캐릭터들을 관리하는 시스템을 구현해봅니다.
    각 캐릭터는 고유한 ID와 이름을 가지며, 시스템은 중복된 캐릭터 생성을 방지해야 합니다.
    이 연습문제를 통해 객체의 고유성을 활용하여 중복 없는 데이터를 관리하는 방법을 실습합니다.

    요구 사항
    Character 클래스 정의

    필드: 캐릭터 ID(String id), 캐릭터 이름(String name)
    생성자: 캐릭터 ID와 이름을 매개변수로 받아 초기화
    hashCode()와 equals() 메서드: 캐릭터 ID를 기준으로 오버라이드
    Main 함수에서 캐릭터 목록 관리

    여러 Character 객체를 생성하고, HashSet에 추가합니다.
    캐릭터 ID가 같은 경우, HashSet에 중복 추가되지 않도록 합니다.
    HashSet에 저장된 모든 캐릭터 정보(ID와 이름)를 출력합니다.


    예시 입력 및 출력

    입력: 캐릭터 정보(캐릭터 ID와 이름)
    ===
    캐릭터1: 캐릭터 ID "char001", 이름 "Dragon Warrior"
    캐릭터2: 캐릭터 ID "char002", 이름 "Elf Archer"
    캐릭터3: 캐릭터 ID "char001", 이름 "Mystic Mage" (캐릭터 ID가 캐릭터1과 동일)

    출력: HashSet에 저장된 캐릭터 정보 출력
    ===
    "캐릭터 정보: ID char001, 이름 Dragon Warrior"
    "캐릭터 정보: ID char002, 이름 Elf Archer"
     */
    static class Character {
        String id;
        String name;

        public Character(String id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Character character = (Character) o;
            return Objects.equals(id, character.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString() {
            return "캐릭터 정보: ID " + id +
                    " 이름 " + name;
        }
    }

    public static void main(String[] args) {
        // Set
        Set<Character> characterSet = new HashSet<>();

        characterSet.add(new Character("char001", "Dragon Warrior"));
        characterSet.add(new Character("char002", "Elf Archer"));
        characterSet.add(new Character("char001", "Mystic Mage"));

        for (Character character : characterSet) {
            System.out.println(character);
        }
    }
}
