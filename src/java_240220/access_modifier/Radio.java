package java_240220.access_modifier;

public class Radio {
    private int volume = 3;     // 요구사항 : 음량이 10을 넘어서는 안됨 (하드웨어 고장) => 제약사항


    // 메서드
    public void volumeUp() {
        if (this.volume >= 10) {
            System.out.println("더이상 음량을 증가할 수 없습니다. ");
            return;     // 메서드 종료
        } else {
            ++this.volume;
            System.out.println("볼륨을 증가합니다. ");
        }
    }

    public void volumeDown() {
        --this.volume;
        System.out.println("볼륨을 감소합니다. ");
    }

    public void printVolume() {
        System.out.println("현재 볼륨: " + this.volume);
    }
}
