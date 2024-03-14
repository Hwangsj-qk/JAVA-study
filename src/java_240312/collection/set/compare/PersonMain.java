package java_240312.collection.set.compare;

import java.util.TreeSet;

public class PersonMain {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();

        treeSet.add(new Person("홍길동", 30));
        // 만약 comparable 을 implement 를 받지 않았다면 add 자체가 안됨
        treeSet.add(new Person("홍길동", 40));
        treeSet.add(new Person("홍길동", 50));

        for (Person person : treeSet) {
            System.out.println(person);
        }

    }
}
