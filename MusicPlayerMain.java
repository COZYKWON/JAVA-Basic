package oop1;

public class MusicPlayerMain {

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.on();

        player.volumeUp();

        player.volumeUp();

        player.volumeDown();

        player.showStatus();

        player.off();
    }
}
