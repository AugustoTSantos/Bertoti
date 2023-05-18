package juncao;

import java.util.List;

class ReprodutorMusicaFacade {
    private List<IPlaylistComponent> playlistComponents;
    private IModoReproducao modoReproducao;

    public ReprodutorMusicaFacade(List<IPlaylistComponent> playlistComponents, IModoReproducao modoReproducao) {
        this.playlistComponents = playlistComponents;
        this.modoReproducao = modoReproducao;
    }

    public void reproduzir() {
        modoReproducao.reproduzir(playlistComponents);
    }
}

