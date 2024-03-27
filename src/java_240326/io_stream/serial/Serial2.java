package java_240326.io_stream.serial;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serial2 {
    public static void main(String[] args) {
        String filePath = "src/java_240326/io_stream/serial/Person.ser";

        // 역직렬화
        try(ObjectInputStream ois = new ObjectInputStream
                (new BufferedInputStream(new FileInputStream(filePath)))) {
            Person person = (Person) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
