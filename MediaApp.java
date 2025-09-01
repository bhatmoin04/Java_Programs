// Base class
class MediaPlayer {
    public void play() {
        System.out.println("Playing media...");
    }
}

// Subclass 1
class AudioPlayer extends MediaPlayer {
    @Override
    public void play() {
        System.out.println("Playing audio file...");
    }
}

// Subclass 2
class VideoPlayer extends MediaPlayer {
    @Override
    public void play() {
        System.out.println("Playing video file...");
    }
}

// Subclass 3
class StreamingPlayer extends MediaPlayer {
    @Override
    public void play() {
        System.out.println("Streaming online content...");
    }
}

// Main class to demonstrate Dynamic Method Dispatch
public class MediaApp {
    public static void main(String[] args) {
        MediaPlayer player; // reference of base class

        // Assign AudioPlayer object
        player = new AudioPlayer();
        player.play(); // calls AudioPlayer's play()

        // Assign VideoPlayer object
        player = new VideoPlayer();
        player.play(); // calls VideoPlayer's play()

        // Assign StreamingPlayer object
        player = new StreamingPlayer();
        player.play(); // calls StreamingPlayer's play()
    }
}
