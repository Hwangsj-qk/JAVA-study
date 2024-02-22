package java_240222.inheritance.ex;

public class PopMusicTrack_Ex2 extends MusicTrack_Ex2 {
    String album;

    @Override
    public void play() {
        super.play();
        System.out.println(", Album: " + album);
    }

}
