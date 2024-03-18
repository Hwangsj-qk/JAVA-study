package java_240318.lambda.mr;

public class Member1 {
    private String id;
    private String name;

    // 생성자
    public Member1(String id) {
        this.id = id;
        System.out.println("Member " + id + " 객체 생성하였습니다. ");
    }

    public Member1(String id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Member " + id + name + " 객체를 생성하였습니다. ");
    }

    // toString

    @Override
    public String
    toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
