package juncao;

import java.util.List;

public class ModoReproducaoSequencial implements IModoReproducao {
    @Override
    public void reproduzir(List<IPlaylistComponent> playlistComponents) {
        System.out.println("Reproduzindo em modo sequencial:");
        for (IPlaylistComponent componentePlaylist : playlistComponents) {
            componentePlaylist.reproduzir();
        }
    }
}
