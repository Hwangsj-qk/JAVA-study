package java_240321.thread;

public class Thread5 {
    public static void main(String[] args) {
        Thread thread = new Thread(new TazangSong(3), "타잔송");

        // 스레드에 이름 부여
//        thread.setName("타잔송");    이름을 설정하는 두가지 방법
        thread.start();

    }
}
