package java_240222.inheritance.ex;

public class ClassicalMusicTrack_Ex2 extends MusicTrack_Ex2{
    // 추가 필드
    String composer;
//
//    public ClassicalMusicTrack_Ex2(String title, String artist, int daurtion) {
//        super(title, ar)
//    }
    @Override
    public void play() {
        super.play();
        System.out.println(", Composer: " + composer);
    }

    }

