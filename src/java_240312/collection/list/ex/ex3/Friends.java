package java_240312.collection.list.ex.ex3;

public class Friends {
    private String name;
    private String email;
    private String phoneNumber;

    public Friends(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "이름: " + name + "\n" +
                "이메일: " + email + "\n" +
                "전화번호: " + phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
