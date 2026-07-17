abstract class MediaPlayer {
    protected String mediaName;

    public MediaPlayer(String mediaName) {
        this.mediaName = mediaName;
    }

    public abstract void play();

    public void stop() {
        System.out.println("Stopping " + mediaName);
    }
}

interface VolumeControl {
    default void volumeUp() {
        System.out.println("Volume increased");
    }

    default void volumeDown() {
        System.out.println("Volume decreased");
    }
}

class AudioPlayer extends MediaPlayer implements VolumeControl {
    public AudioPlayer(String mediaName) {
        super(mediaName);
    }

    @Override
    public void play() {
        System.out.println("Playing audio: " + mediaName);
    }
}

public class Exercise1Solution {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer("Song.mp3");
        player.play();
        player.stop();
        player.volumeUp();
        player.volumeDown();
    }
}
