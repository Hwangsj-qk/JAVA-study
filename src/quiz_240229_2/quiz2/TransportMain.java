package quiz_240229_2.quiz2;

public class TransportMain {
    public static void main(String[] args) {
        Transport [] transport = {new Car(), new Bicycle(), new Train()};

        for (Transport t : transport) {
            t.move();
        }
    }
}
