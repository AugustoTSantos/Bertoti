package juncao;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Criação das músicas
        Musica musica1 = new Musica("Música 1", "Artista 1");
        Musica musica2 = new Musica("Música 2", "Artista 2");

        // Criação da playlist
        Playlist playlist = new Playlist("Minha Playlist");
        playlist.adicionar(musica1);
        playlist.adicionar(musica2);

        // Criação do observador
        IObserver observer = new PlaylistObserver("Observador 1");

        // Criação do gerenciador de playlists e registro do observador
        GerenciadorPlaylist gerenciador = GerenciadorPlaylist.getInstance();
        gerenciador.adicionarObserver(observer);

        // Criação do reprodutor de músicas e reprodução da playlist
        List<IPlaylistComponent> componentesPlaylist = new ArrayList<>();
        componentesPlaylist.add(playlist); // Adiciona a playlist à lista de componentes

        ReprodutorMusicaFacade reprodutor = new ReprodutorMusicaFacade(componentesPlaylist, new ModoReproducaoSequencial());
        reprodutor.reproduzir();

        // Remoção de uma música da playlist
        playlist.remover(musica1);

        // Notificação dos observadores sobre a atualização da playlist
        gerenciador.notificarObservers();

        // Reprodução da playlist novamente
        reprodutor.reproduzir();
    }
}
