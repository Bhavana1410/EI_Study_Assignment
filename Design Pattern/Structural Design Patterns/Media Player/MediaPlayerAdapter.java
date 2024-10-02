public class MediaPlayerAdapter implements MediaPlayer {
    private VLCPlayer vlcPlayer;

    public MediaPlayerAdapter(VLCPlayer vlcPlayer) {
        this.vlcPlayer = vlcPlayer;
    }

    @Override
    public void play(String filename) {
        vlcPlayer.playVLC(filename);
    }
}
