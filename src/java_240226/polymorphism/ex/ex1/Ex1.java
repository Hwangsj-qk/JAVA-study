package java_240226.polymorphism.ex.ex1;


public class Ex1 {
    /*
    자동차는 4개의 타이어를 가지고 있으며, 각 타이어는 "앞왼쪽", "앞오른쪽", "뒤왼쪽", "뒤오른쪽"의 위치를 가진다.
모든 타이어는 최대 회전 수(maxRotation)를 가지고 있으며, 이는 타이어의 수명을 나타낸다. 타이어가 회전할 때마다 누적 회전 수(accumulatedRotation)가 증가하며, 누적 회전 수가 최대 회전 수에 도달하면 타이어는 펑크 난다.
타이어가 펑크 나면, 해당 타이어는 "HankookTire" 또는 "KumhoTire"로 교체된다. 각 타이어 교체 시, 교체되는 타이어의 위치와 새로운 최대 회전 수가 주어진다.
자동차가 달릴 때, 모든 타이어는 회전 기능(roll)을 호출하여 회전 여부를 확인한다. 타이어가 정상적으로 회전하면 true를, 펑크 나면 false를 반환한다.
자동차가 달릴 때마다 모든 타이어의 회전 여부를 체크하고, 펑크 난 타이어가 있으면 즉시 멈추고 해당 타이어를 교체한다. 이 과정은 자동차가 5번 달릴 때까지 반복된다.
구현해야 할 클래스:

Tire 클래스: 타이어의 기본 정보(위치, 최대 회전 수, 누적 회전 수)와 기본 회전 기능을 구현한다.
HankookTire 클래스: Tire 클래스를 상속받아 특정 브랜드("Hankook")의 타이어로 구현한다. 회전 기능을 오버라이드하여 특정 조건에서 펑크를 나타내는 메시지를 출력한다.
KumhoTire 클래스: Tire 클래스를 상속받아 또 다른 브랜드("Kumho")의 타이어로 구현한다. 회전 기능을 오버라이드하여 특정 조건에서 펑크를 나타내는 메시지를 출력한다.
Car 클래스: 4개의 타이어 객체를 관리하고, 타이어의 회전 여부를 체크하여 필요에 따라 타이어를 교체하는 기능을 구현한다.
CarExample 클래스: Car 객체를 생성하고, 자동차를 5번 달리게 하여 각 달릴 때마다의 상황을 시뮬레이션한다.
힌트:

타이어의 roll 메서드는 타이어가 정상적으로 회전할 수 있으면 true를 반환하고, 그렇지 않으면 false를 반환하여 타이어 교체가 필요함을 알린다.
Car 클래스의 run 메서드는 자동차가 달릴 때마다 모든 타이어의 roll 메서드를 호출하고, 필요한 경우 타이어를 교체한다.
     */
    public static void main(String[] args) {
        int number = 5;
        Car car = new Car();
        boolean stop = false;


        while (!stop) {     // stop이 true가 아니라면(무한반복)
            int num = car.run();        // 0,1,2,3,4를 반환
            switch (num) {
                case 1 :
                    System.out.println("앞 왼족 타이어를 교체");
                    car.frontLeftTire = new KumhoTire(15, "앞왼쪽");
                    break;

                case 2:
                    System.out.println("앞 오른쪽 타이어를 교체");
                    car.frontRightTire = new HankookTire(15, "앞오른쪽");
                    break;

                case 3:
                    System.out.println("뒤 왼쪽 타이어를 교체");
                    car.backLeftTire = new HankookTire(15, "뒤 왼쪽");
                    break;

                case 4:
                    System.out.println("뒤 오른쪽 타이어를 교체");
                    car.backRightTire = new HankookTire(15, "뒤 오른쪽");
                    break;
            }
            number--;
            if(number == 0){
                stop = true;
            }

        }
    }
}
