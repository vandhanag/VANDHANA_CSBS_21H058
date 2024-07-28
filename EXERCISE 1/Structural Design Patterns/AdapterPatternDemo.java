interface MediaPlayer {
    void play(String audioType, String fileName);
}

interface AdvancedMediaPlayer {
    void playMP4(String fileName);

    void playMP3(String fileName);
}

class MP4Player implements AdvancedMediaPlayer {
    public void playMP4(String fileName) {
        System.out.println("Playing MP4 file. Name: " + fileName);
    }

    public void playMP3(String fileName) {
        // Do nothing
    }
}

class MP3Player implements AdvancedMediaPlayer {
    public void playMP4(String fileName) {
        // Do nothing
    }

    public void playMP3(String fileName) {
        System.out.println("Playing MP3 file. Name: " + fileName);
    }
}

class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new MP4Player();
        } else if (audioType.equalsIgnoreCase("mp3")) {
            advancedMusicPlayer = new MP3Player();
        }
    }

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMP4(fileName);
        } else if (audioType.equalsIgnoreCase("mp3")) {
            advancedMusicPlayer.playMP3(fileName);
        }
    }
}

public class AdapterPatternDemo {
    public static void main(String[] args) {
        MediaPlayer player = new MediaAdapter("mp3");
        player.play("mp3", "song.mp3");

        player = new MediaAdapter("mp4");
        player.play("mp4", "video.mp4");
    }
}
