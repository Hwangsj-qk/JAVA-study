package java_240305.library.lang.ex.ex2;


import java.util.Objects;
public class Click {

    // 연습문제2
    // Click 클래스는 x좌표, y좌표, 시간(timestamp : int타입)을 저장하는 클래스
    // 실제 Click 인스턴스가 x좌표, y좌표가 같으면 동등하다라고 인정되게끔
    // eqauls메서드를 overriding 해서 메인메서드로 확인해보세요.
    int x;
    int y;
    int timestamp;

    public Click(int x, int y, int timestamp) {
        this.x = x;
        this.y = y;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {   // 마법사로 만들 수 있음
        if (this == o) return true;     //참조값 같은지 비교 => true
        if (o == null || getClass() != o.getClass()) return false;
        // null인 경우, 타입이 다른 경우 false
        Click click = (Click) o;
        // 다운캐스팅하여 해당 필드값 비교
        return x == click.x && y == click.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public static void main(String[] args) {
        Click click1 = new Click(123,456,12355);
        Click click2 = new Click(123,456,123335);
        Click click3 = new Click(123,456,12344);
        Click click4 = new Click(123,123,1234355);
        Click click5 = new Click(333,456,1235345);
        Click click6 = null;
        Object click7 = new Object();

        System.out.println(click1.equals(click2));    // true
        System.out.println(click1.equals(click3));    // true
        System.out.println(click1.equals(click4));    // false
        System.out.println(click1.equals(click5));    // false
        System.out.println(click1.equals(click6));    // false
        System.out.println(click1.equals(click7));    // false
    }

}

