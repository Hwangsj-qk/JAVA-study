package java_240226.polymorphism.interface0.car;

public class Driver {
    // 운전자는 Avante를 소유하고, 운전을 할 수 있다.
    // 필드
    private Avante avante;
    // 차랑이 추가 되면 코드가 변경되어야 한다.
    private Sonata sonata;

    public void setAvante(Avante avante) {
        this.avante = avante;
    }

    public void setSonata(Sonata sonata) {
        this.sonata = sonata;
    }

    // 운전
    // 차량이 추가될 대마다 코드가 변경되어야 한다.
    public void drive() {
        if(avante != null) {
            avante.onEngine();
            avante.pressAccel();
            avante.pressBreak();
            avante.offEngine();
        } else if (sonata != null) {
            sonata.onEngine();
            sonata.pressAccel();
            sonata.pressBreak();
            sonata.offEngine();
        }

    }
}
