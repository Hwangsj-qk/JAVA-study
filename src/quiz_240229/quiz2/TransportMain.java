package quiz_240229.quiz2;

import quiz_240229.quiz2.Bicycle;
import quiz_240229.quiz2.Car;
import quiz_240229.quiz2.Train;
import quiz_240229.quiz2.Transport;

public class TransportMain {
    public static void main(String[] args) {
        Transport [] transport = {new Car(), new Bicycle(), new Train()};

        for (Transport t : transport) {
            t.move();
        }
    }
}
