package juncao;

public class PlaylistObserver implements IObserver {
    private String nome;

    public PlaylistObserver(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar() {
        System.out.println(nome + ": Uma playlist foi atualizada.");
    }
}
