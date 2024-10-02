public class Main {
    public static void main(String[] args) {
        MediaPlayer mp3Player = new MP3Player();
        mp3Player.play("song.mp3");

        VLCPlayer vlcPlayer = new VLCPlayer();
        MediaPlayer adapter = new MediaPlayerAdapter(vlcPlayer);
        adapter.play("movie.vlc");
    }
}
