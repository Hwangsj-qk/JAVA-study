package java_240222.inheritance.ex;

public class MusicPlayerMain_Ex2 {
    public static void main(String[] args) {
        ClassicalMusicTrack_Ex2 classicalMusicTrackEx2 = new ClassicalMusicTrack_Ex2();
        classicalMusicTrackEx2.title = "Symphony No. 9";
        classicalMusicTrackEx2.artist = "Beethoven";
        classicalMusicTrackEx2.composer = "Beethoven";
        classicalMusicTrackEx2.play();

        PopMusicTrack_Ex2 popMusicTrackEx2 = new PopMusicTrack_Ex2();
        popMusicTrackEx2.title = "Shape of You";
        popMusicTrackEx2.artist = "Ed Sheeran";
        popMusicTrackEx2.album = "Divide";
        popMusicTrackEx2.play();

    }
}
