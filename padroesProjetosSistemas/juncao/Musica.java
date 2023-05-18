package juncao;

public class Musica implements IPlaylistComponent {
    private String nome;
    private String artista;

    public Musica(String nome, String artista) {
        this.nome = nome;
        this.artista = artista;
    }

    @Override
    public void reproduzir() {
        System.out.println("Tocando música: " + nome + " - " + artista);
    }
}
