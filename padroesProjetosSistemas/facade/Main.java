package facade;

public class Main {
    public static void main(String[] args) {
        MusicPlayerFacade musicPlayer = new MusicPlayerFacade();

        musicPlayer.playMusic("Song 1");
    }
}
