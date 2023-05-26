package facade;

class MusicPlayerFacade {
    private MusicPlayer musicPlayer;

    public MusicPlayerFacade() {
        musicPlayer = new MusicPlayer();
    }

    public void playMusic(String song) {
        musicPlayer.load(song);
        musicPlayer.play();
    }
}
