package java_240227.solid.lsp.after;

public class Main {
    public static void main(String[] args) {
        //lsp 원칙을 어기지 않으면서
        Bird[] birds = {new Duck(), new Ostrich()};

        for (Bird bird : birds) {
//            bird.fly();       Bird 클래스에는 실제로 아무 메서드도 없음 (새 = 난다 x)
        }

        // 날 수 있는 새들만 따로 메서드를 구현할 수 있다.
        Flyable[] flyables = {new Duck()};

        for (Flyable flyable : flyables) {
            flyable.fly();
        }
    }
}
