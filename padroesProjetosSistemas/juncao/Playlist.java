package juncao;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements IPlaylistComponent {
    private String nome;
    private List<IPlaylistComponent> playlistComponents;

    public Playlist(String nome) {
        this.nome = nome;
        playlistComponents = new ArrayList<>();
    }

    public void adicionar(IPlaylistComponent componente) {
        playlistComponents.add(componente);
    }

    public void remover(IPlaylistComponent componente) {
        playlistComponents.remove(componente);
    }

    @Override
    public void reproduzir() {
        System.out.println("Tocando playlist: " + nome);
        for (IPlaylistComponent componente : playlistComponents) {
            componente.reproduzir();
        }
    }
}
