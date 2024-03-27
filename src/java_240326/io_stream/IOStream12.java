package java_240326.io_stream;

import java.io.*;
import java.util.Arrays;

public class IOStream12 {
    // 객체를 직렬화하기 위해서는 Serializable 구현해야함
    static class Member implements Serializable {
        // 강제하는 것이 없음 -> 직렬화가 가능하다는 것을 보여주는 것
        String id;
        String name;

        public Member(String id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return id + " : " + name;
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePath = "src/java_240326/io_stream/object.dat";
        // dat 파일은 텍스트 파일처럼 열 순 없음
        FileOutputStream fos = new FileOutputStream(filePath);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // 객체 생성
        Member member1 = new Member("winter", "한겨울");
        Member member2 = new Member("spring", "봄봄");
        Member [] members = {member1, member2};

        // 객체를 직렬화
        oos.writeObject(member1);
        oos.writeObject(member2);
        oos.writeObject(members);

        oos.flush(); oos.close(); fos.close();

        // 역직렬화
        FileInputStream fis = new FileInputStream(filePath);
        ObjectInputStream ois = new ObjectInputStream(fis);

        // 파일에서 역직렬화를 통해 객체로 복원
        // 여러개의 객체를 저장할 때는 출력된 순서와 동일하게 읽어와야 가능
        Member member11 = (Member) ois.readObject();
        // 리턴 타입이 object 임 -> 원하는 타입으로 캐스팅 필요
        Member member22 = (Member) ois.readObject();
        Member[] memberArr = (Member[]) ois.readObject();

        System.out.println(member11);
        System.out.println(member22);
        System.out.println(Arrays.toString(memberArr));



    }
}
