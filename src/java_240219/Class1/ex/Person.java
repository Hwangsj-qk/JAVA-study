package java_240219.Class1.ex;

public class Person {
    String name;
    int age;
    String gender;

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

        }
    Person (String name, String gender) {
        this(name, 0, gender);      // 생성자의 첫 줄에만 호출 가능 => 나이는 해당 생성자에는 없지만, 값은 입력
    }

        void printInfo() {
        System.out.println("이름: " + name + " 나이: " + age + " 성별: " + gender);

            }
        }




