package java_240227.solid.lsp.before;

public class Main {
    public static void main(String[] args) {
        Bird[]birds = {new Duck(), new Ostrich()};

        for (Bird bird : birds) {
            bird.fly();
            // 런타임 오류
        }
    }
}
