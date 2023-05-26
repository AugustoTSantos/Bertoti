package facade;

class MusicPlayer {
    public void load(String song) {
        System.out.println("Carregando a música: " + song);
    }

    public void play() {
        System.out.println("Reproduzindo música");
    }
}
