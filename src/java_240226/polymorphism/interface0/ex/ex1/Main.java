package java_240226.polymorphism.interface0.ex.ex1;

public class Main {
    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player();
        CDPlayer cdPlayer = new CDPlayer();

        mp3Player.play();
        mp3Player.pause();
        mp3Player.stop();
        cdPlayer.play();
        cdPlayer.pause();
        cdPlayer.stop();


    }
    static void play(Playable playable) {
        playable.play();
    }
    static void pause(Playable playable) {
        playable.pause();
    }
    static void stop(Playable playable) {
        playable.stop();
    }
}
