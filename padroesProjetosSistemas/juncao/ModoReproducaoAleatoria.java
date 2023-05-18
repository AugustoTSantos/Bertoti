package juncao;

import java.util.List;
import java.util.Collections;

public class ModoReproducaoAleatoria implements IModoReproducao {
    @Override
    public void reproduzir(List<IPlaylistComponent> playlistComponents) {
        // Embaralhar a lista de músicas
        Collections.shuffle(playlistComponents);

        System.out.println("Reproduzindo em modo aleatório:");
        for (IPlaylistComponent componentePlaylist : playlistComponents) {
            componentePlaylist.reproduzir();
        }
    }
}
